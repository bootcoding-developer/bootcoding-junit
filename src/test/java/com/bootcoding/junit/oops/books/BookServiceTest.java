package com.bootcoding.junit.oops.books;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookServiceTest {

    @Test
    public void testArrayEquals() {
        BookService bookService = new BookService();

        Book b1 = new Book("1", "Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", "Prentice Hall");
        Book b2 = new Book("2", "Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamm", "Addison-Wesley");
        Book b3 = new Book("3", "Effective Java", "Joshua Bloch", "Addison-Wesley");
        Book b4 = new Book("4", "The Pragmatic Programmer: Your Journey to Mastery", "Andrew Hunt", "Addison-Wesley");

        bookService.addBook(b1);
        bookService.addBook(b2);
        bookService.addBook(b3);
        bookService.addBook(b4);

        String[] actualBookIds = bookService.getBookIdsByPublisher("Addison-Wesley");

        assertArrayEquals(new String[] {"2", "3", "4"}, actualBookIds);
    }

}