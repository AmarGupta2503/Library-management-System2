# Library-management-System
A Library Management System (LMS) is a software designed to manage and automate the various tasks and activities of a library. It helps streamline library operations, improve efficiency, and provide better services to library users. Here are key components and features of a typical Library Management System:

• Model:
The model represents the application's data and business logic. It is responsible for managing and manipulating the data, as well as responding to requests for information about the state of the application.
In Java, the model typically consists of classes that represent entities, data structures, and business logic. It can also include database access code.

• View:
The view is responsible for presenting the data to the user and receiving user input. It displays information from the model and sends user actions back to the controller for further processing.
In Java, the view is often implemented using UI components such as JavaFX views, Swing components, or JSP pages in web applications.

• Controller:
The controller acts as an intermediary between the model and the view. It receives user input from the view, processes it, and updates the model accordingly. It also receives notifications from the model about changes and updates the view to reflect those changes.
In Java, controllers are implemented as classes that handle user input events, orchestrate interactions between the model and the view, and update the model and view accordingly.

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

Screen Shots:-
To Add Book:-

![image](https://github.com/AmarGupta2503/Library-management-System2/assets/162796574/ab95e0a5-3c11-4619-8f3a-0d3d02bfa3d8)

To Remove Book:-


![image](https://github.com/AmarGupta2503/Library-management-System2/assets/162796574/06c067c9-bbb8-4c43-aaaf-9a2cc321329e)

To Fetch Book:-


![image](https://github.com/AmarGupta2503/Library-management-System2/assets/162796574/06af2bac-647d-4bc2-8e95-7857da7cd8a9)

To Update Book Record:-


![Uploading image.png…]()



