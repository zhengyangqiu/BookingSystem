package com.up.libraryBookingSystem;

import com.up.libraryBookingSystem.pojo.Authors;
import com.up.libraryBookingSystem.pojo.Books;
import com.up.libraryBookingSystem.pojo.Users;
import com.up.libraryBookingSystem.service.AuthorService;
import com.up.libraryBookingSystem.service.BookService;
import com.up.libraryBookingSystem.service.UserService;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
public class LibraryController {

    private UserService userService;
    private AuthorService authorService;
    private BookService bookService;

    public LibraryController(UserService userService) {
        this.userService = userService;
    }

    public LibraryController(AuthorService authorService) {
        this.authorService = authorService;
    }

    public LibraryController(BookService bookService) {
        this.bookService = bookService;
    }

    //Users
    @GetMapping(path = "users")
    public List<Users> getUsers() {
        return userService.displayUsers();
    }

    @GetMapping(path = "users/{id}")
    public Users getUserById(@PathVariable("id") Integer userId) {
        return userService.selectUserById(userId);
    }

    @PostMapping(path = "users")
    public void addUser(@RequestBody Users user) {
        userService.addUser(user);
    }

    @DeleteMapping(path = "users/{id}")
    public void deleteUserById(@PathVariable("id") Integer userId) {
        userService.deleteUser(userId);
    }

    @PutMapping(path = "users/{id}")
    public void updateUser(@PathVariable("id") Integer userId, @RequestBody Users updatedUser) {
        userService.updateUser(userId, updatedUser);
    }

    //Books
    @GetMapping(path = "books")
    public List<Books> getBooks() {
        return bookService.displayBooks();
    }

    @GetMapping(path = "books/{id}")
    public Books getBookById(@PathVariable("id") Integer bookId) {
        return bookService.selectBookById(bookId);
    }

    @PostMapping(path = "books")
    public void addBook(@RequestBody Books book) {
        bookService.addBook(book);
    }

    @DeleteMapping(path = "books/{id}")
    public void deleteBookById(@PathVariable("id") Integer bookId, @RequestBody Books book) {
        bookService.deleteBook(bookId, book);
    }

    @PutMapping(path = "books/{id}")
    public void updateBook(@PathVariable("id") Integer bookId, @RequestBody Books updatedBook) {
        bookService.updateBook(bookId, updatedBook);
    }

    //Authors
    @GetMapping(path = "authors")
    public List<Authors> getAuthors() {
        return authorService.displayAuthors();
    }

    @GetMapping(path = "authors/{id}")
    public Authors getAuthorById(@PathVariable("id") Integer authorId) {
        return authorService.selectAuthorById(authorId);
    }

    @GetMapping(path = "authors/{name}")
    public Authors getAuthorByName(@PathVariable("name") String authorName) {
        return authorService.selectAuthorByName(authorName);
    }

    @PostMapping(path = "authors")
    public void addAuthor(@RequestBody Authors author) {
        authorService.addAuthor(author);
    }

    @DeleteMapping(path = "authors/{id}")
    public void deleteAuthorById(@PathVariable("id") Integer authorId) {
        authorService.deleteAuthor(authorId);
    }

    @PutMapping(path = "author/{id}")
    public void updateAuthor(@PathVariable("id") Integer authorId, @RequestBody Authors updatedAuthor) {
        authorService.updateAuthor(authorId, updatedAuthor);
    }
}

