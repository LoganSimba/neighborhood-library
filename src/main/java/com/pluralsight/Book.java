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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTO() {
        return checkedOutTO;
    }

    public void setCheckedOutTO(String checkedOutTO) {
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
