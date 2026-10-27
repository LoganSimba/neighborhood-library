package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTO;

    // constructor
    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTO) {
            this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTO = checkedOutTO;
    }

    //method to check who checked out the book
    public void checkedOut(String name){
        this.checkedOutTO = name;
        isCheckedOut = true;
    }

    // checking if we the booked is checked in and available
    public void checkIn(){
        this.checkedOutTO = "";
        isCheckedOut = false;

    }

}
