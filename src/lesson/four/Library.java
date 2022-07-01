package lesson.four;

import java.util.Optional;
import java.util.Scanner;

// бібліотека
public class Library {
    public static void main(String[] args) {
        Book book1 = new Book();
        // null - пусте значення
        book1.setTitle("American Gods");
        book1.setAuthor("Neil Gaiman");
        book1.setGenre("Novel");
        book1.setYear(2010);
//        System.out.println("Author is " + book1.getAuthor());
//        System.out.println("Title is " + book1.getTitle());
//        System.out.println("Genre is " + book1.getGenre());
//        System.out.println("Year is " + book1.getYear());
//        Scanner scanner = new Scanner(System.in);
        Book book2 = new Book();
        book2.setAuthor("Joan Rowling");
        book2.setTitle("Harry Potter");
        book2.setGenre("Fantasy");
        book2.setYear(2001);

//        System.out.println("second book is " + book2.getTitle());
        Book book3 = new Book("Stephen King", "Green mile", "Horror", 2003);
//        System.out.println("Thrid book is " + book3.getTitle());
//        System.out.println("Third book's author is " + book3.getAuthor());
//        System.out.println("Third book's genre is " + book3.getGenre());

        Scanner scanner = new Scanner(System.in);
        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}
