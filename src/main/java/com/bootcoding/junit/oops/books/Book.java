package com.bootcoding.junit.oops.books;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private String bookId;
    private String title;
    private String author;
    private String publisher;

}
