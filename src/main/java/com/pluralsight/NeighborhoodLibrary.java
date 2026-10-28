package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class NeighborhoodLibrary {

    public static void main(String[] args) {
        //initiate scanner
        Scanner scanner = new Scanner(System.in);






    }
    // added a method to create what is in the library
        public static ArrayList<Book> createLibrary(Scanner scanner, Book[] books) {
            ArrayList<Book> library = new ArrayList<>();

            Book book1 = new Book(1, "978-0-06-112008-4", "To Kill a Mockingbird", false, "");
            Book book2 = new Book(2, "978-0-452-28423-4", "1984", false, "");
            Book book3 = new Book(3, "978-0-7432-7356-5", "The Great Gatsby", false, "");
            Book book4 = new Book(4, "978-0-14-143951-8", "Pride and Prejudice", false, "");
            Book book5 = new Book(5, "978-0-316-76948-0", "The Catcher in the Rye", false, "");

            //get the books i created into my library
            library.add(book1);
            library.add(book2);
            library.add(book3);
            library.add(book4);
            library.add(book5);

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
        }



        }




