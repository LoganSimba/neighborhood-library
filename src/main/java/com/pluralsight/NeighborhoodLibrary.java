package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class NeighborhoodLibrary {

    public static void main(String[] args) {
        //initiate scanner
        Scanner scanner = new Scanner(System.in);

        Book[] library = createLibrary(scanner, null);
        homeScreen(scanner, library);

    }
    // added a method to create what is in the library
    public static Book[] createLibrary(Scanner scanner, Book[] books) {
        Book[] library = new Book[5];

        Book book1 = new Book(1, "978-0-06-112008-4", "To Kill a Mockingbird", false, "");
        Book book2 = new Book(2, "978-0-452-28423-4", "1984", false, "");
        Book book3 = new Book(3, "978-0-7432-7356-5", "The Great Gatsby", false, "");
        Book book4 = new Book(4, "978-0-14-143951-8", "Pride and Prejudice", false, "");
        Book book5 = new Book(5, "978-0-316-76948-0", "The Catcher in the Rye", false, "");

        //get the books i created into my library
        library[0] = book1;
        library[1] = book2;
        library[2] = book3;
        library[3] = book4;
        library[4] = book5;

        return library;
    }
    // method that loops in the library and shows which book is available
    public static void showAvailableBooks(Scanner scanner, Book[] library){
        System.out.print("Available books: ");
        //loop thorugh array of books and check if its checked out
        for(Book book : library){
            if (!book.isCheckedOut()) {
                System.out.println("ID: " + book.getId()
                        + " | ISBN: " + book.getIsbn()
                        + " | Title: " + book.getTitle());
            }
        }
        //prompt user to check out a book
        System.out.print("Enter the ID of the book to check out, or X to go back: ");
        String input = scanner.nextLine().trim();

        //check if the user wants to return
        if (input.equalsIgnoreCase("X")) {
            return;
        }

        //iterate to check the name of book in the available books
        for (Book book : library) {
            if (book.getTitle().equalsIgnoreCase(input) && !book.isCheckedOut()) {
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                book.checkedOut(name);
                System.out.println("Book checked out to " + name);
            }
        }
        //give user options to check in book or go back to home screen
        System.out.print("\nC - Check in a book\nX - Go back to home screen\nChoose: ");
        String choice = scanner.nextLine().trim();

        if (choice.equalsIgnoreCase("C")) {
            checkInBook(scanner, library);
        }

    }
    // method to check books that are checked out
    public static void checkedOutBooks(Scanner scanner, Book[] library){
        System.out.println("Checked out Books: ");
        //iterate and check if the boolean is true
        for(Book book : library){
            if(book.isCheckedOut()){
                System.out.println("ID: " + book.getId()
                        + " | ISBN: " + book.getIsbn()
                        + " | Title: " + book.getTitle()
                        + " | Checked out to: " + book.getCheckedOutTO());;
            }
        }


    }
    // asks for an ID and checks that book back in
    public static void checkInBook(Scanner scanner, Book[] library) {
        System.out.print("Enter the name of the book to check in: ");
        String search = scanner.nextLine().trim();
        //iterate to fing check
        for (Book book : library) {
            if (book.getTitle().equalsIgnoreCase(search)  && book.isCheckedOut()) {
                book.checkIn();
                System.out.println(book.getTitle() + " is checked in.");
                return;
            }
        }
        System.out.println("No checked out book with that name.");
    }

    // method to show home screen menu loop
    public static void homeScreen(Scanner scanner, Book[] library) {
        //boolean to track if the app runs or stops
        boolean running = true;

        while (running) {
            System.out.println("\n--- Library Home---");
            System.out.println("1 - Show Available Books");
            System.out.println("2 - Show Checked Out Books");
            System.out.println("3 - Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine().trim();
            //switch cases for the  user interface
            switch (choice) {
                case "1" -> showAvailableBooks(scanner, library);
                case "2" -> checkedOutBooks(scanner, library);
                case "3" -> running = false;
                default -> System.out.println("Invalid option.");
            }
        }
        System.out.println("You chose to exit");
    }
}