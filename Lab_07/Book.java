package com.company;
public class Book {
    private Person author;
    private String bookName;
    private String publisher;
    public Book(){
    }
    public Book(Person author, String bookname, String publisher){
        this.author = author;
        this.bookName = bookname;
        this.publisher = publisher;
    }
    public void setAuthor(Person author) {
        this.author = author;
    }
    public void setBook_name(String book_name) {
        this.bookName = bookName;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void display(){
        System.out.println("Book name: " + bookName + "\nBook publisher: " + publisher);
        author.display();
    }
}
