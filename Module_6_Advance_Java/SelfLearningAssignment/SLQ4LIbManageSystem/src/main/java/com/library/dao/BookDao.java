package com.library.dao;

import java.util.List;
import com.library.model.Book;

public interface BookDao {

    boolean addBook(Book b);

    List<Book> getAllBooks();

    Book getBookById(int id);

    boolean updateBook(Book b);

    boolean deleteBook(int id);
}