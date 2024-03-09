# Library-management-System2
Certainly! A Library Management System (LMS) is a software designed to manage and automate the various tasks and activities of a library. It helps streamline library operations, improve efficiency, and provide better services to library users. Here are key components and features of a typical Library Management System:
• Model: The Model represents the data and business logic of the application. In this project, the Model includes two main entities: Book and Library. The Book entity represents a book with attributes such as name, price, and author name. The Library entity represents a library with attributes such as name, address, pincode, and a list of books.

• View: The View is responsible for presenting the data to the user and receiving user input. In this project, the View would include the user interface components such as forms, tables, and buttons used to interact with the system.

• Controller: The Controller acts as an intermediary between the Model and the View. It processes user input from the View, interacts with the Model to perform actions such as adding, removing, updating, and deleting books, and updates the View to reflect the changes.

Entities
Book
• Attributes:-
• bookName: Name of the book  
• bookPrice: Price of the book  
• authorName: Name of the author  

• Methods:-
• getBookName(): Returns the name of the book  
• setBookName(String bookName): Sets the name of the book  
• getBookPrice(): Returns the price of the book  
• setBookPrice(double bookPrice): Sets the price of the book  
• getAuthorName(): Returns the name of the author  
• setAuthorName(String authorName): Sets the name of the author  
• toString(): Returns a string representation of the book  

Library

• Attributes:-
• libraryName: Name of the library    
• libraryAddress: Address of the library    
• pincode: Pincode of the library location  
• books: List of books in the library 

• Methods:-
• getBooks(): Returns the list of books in the library  
• setBooks(List<Book> books): Sets the list of books in the library  
• getLibraryName(): Returns the name of the library  
• setLibraryName(String libraryName): Sets the name of the library  
• getLibraryAddress(): Returns the address of the library  
• setLibraryAddress(String libraryAddress): Sets the address of the library  
• getPincode(): Returns the pincode of the library location  
• setPincode(int pincode): Sets the pincode of the library location  

Functionality:-
• Add a book to the library
• Update book details
• Remove a book from the library
• Retrieve book details

Screen Shots
