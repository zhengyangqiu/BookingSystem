package com.up.libraryBookingSystem.dao;


import com.up.libraryBookingSystem.pojo.Books;

import java.util.List;

public class BooksDataAccessService implements BooksDao {


    @Override
    public int addBooks() {
        return 0;
    }

    @Override
    public int addBook() {
        return 0;
    }

    @Override
    public List<Books> selectAllBooks() {
        return null;
    }

    @Override
    public int deleteBook(Integer BookId) {
        return 0;
    }

    @Override
    public int updateBook(Integer BookId, Books bookUpdate) {
        return 0;
    }

    @Override
    public boolean selectBookById(Integer BookId) {
        return true;
    }
}
