package com.jsp.lms.view;

import java.util.Scanner;

import com.jsp.lms.model.Book;
import com.jsp.lms.model.Library;
import com.jsp.lms.controller.*;

public class View {
	public static Library library = new Library();
	Book book = new Book();

	public static Library getLibrary() {
		return library;
	}

	public static void setLibrary(Library library) {
		View.library = library;
	}

	static Scanner myInput = new Scanner(System.in);
	static Controller controller = new Controller();

	static {
		System.out.println("-----Welcome to LMS------");
		System.out.print("Enter name of library: ");
//		String libraryName = myInput.nextLine();
		library.setLibraryName(myInput.nextLine());

		System.out.print("Enter address of library : ");
		library.setLibraryAddress(myInput.nextLine());

		System.out.print("Enter pincode : ");
		library.setPincode(myInput.nextInt());

	}

	public static void main(String[] args) {

		do {
			System.out.println("Select option to perform");
			System.out.println(" 1.Add book\n 2.Remove book\n 3.Update book\n 4.Get book\n 0.Exit");
			System.out.print("Enter digit respective to desire option : ");
			byte userChoice = myInput.nextByte();
			myInput.nextLine();
			switch (userChoice) {
			case 0:
				myInput.close();
				System.out.println("-------E X I T E D-------");
				System.exit(0);
				break;
			case 1:

				Book book = new Book();

				controller.addBook(book);

				System.out.println("Enter the name of the book");
				book.setBookName(myInput.nextLine());
//				myInput.nextLine();
				System.out.println("Enter the author name");
				book.setBookAuthor(myInput.nextLine());
//				myInput.nextLine();

				System.out.println("Enter the price of the book");
				book.setBookPrice(myInput.nextDouble());
//				myInput.nextLine();
				break;
			case 2:
				System.out.println("Enter the book name to be remove:-");
				String bookToRemove = myInput.nextLine();
				if (controller.removeBook(bookToRemove)) {
					System.out.println("Requested book has been removed");

				} else {
					System.out.println("Book does not exists");
				}

				break;
			case 3:
				System.out.println("Enter book name to update :");
				Book bookExists = controller.getBook(myInput.nextLine());
				if (bookExists != null) {
					Book bookToUpdate = bookExists;
					System.out.println("what to update?");
					System.out.println("1.Book name\n2.Author name\n3.Book price");
					System.out.print("Enter digit respective to desire option : ");
					byte updateChoice = myInput.nextByte();
					myInput.nextLine();
					switch (updateChoice) {
					case 1:
						System.out.println("Enter book name to update :");
						bookToUpdate.setBookName(myInput.nextLine());
						break;
					case 2:
						System.out.println("Enter author name to update :");
						bookToUpdate.setBookAuthor(myInput.nextLine());
						break;
					case 3:
						System.out.println("Enter price to update");
						bookToUpdate.setBookPrice(myInput.nextDouble());
						break;

					default:
						System.out.println("-------INVALID SELECTION-------");
						break;
					}
				}

				break;
			case 4:
				System.out.println("Enter name of the book you looking for:");
				Book fetchBook = controller.getBook(myInput.nextLine());
				if (fetchBook != null) {

					System.out.println("Book is available");
					System.out.println("Details :");
					System.out.println(fetchBook);
				} else {
					System.out.println("Book is not availlable");
				}

				break;

			default:
				System.out.println("Invalid selection");
				break;
			}
		} while (true);
	}

}
