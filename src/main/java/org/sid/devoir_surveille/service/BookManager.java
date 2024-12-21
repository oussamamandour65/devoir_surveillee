package org.sid.devoir_surveille.service;

import org.sid.devoir_surveille.dao.entities.Book;
import org.sid.devoir_surveille.dao.repositories.BookRepository;
import org.sid.devoir_surveille.dto.BookDto;
import org.sid.devoir_surveille.mapper.BookMapper;

import java.util.ArrayList;
import java.util.List;

public class BookManager implements BookService {


    private BookRepository bookRepository;
    private BookMapper bookMapper;

    @Override
    public BookDto saveBook(BookDto bookDto) {
        Book book = bookMapper.fromBookDtoToBook(bookDto);
        book = bookRepository.save(book);
        bookDto = bookMapper.fromBookToBookDto(book);
        return bookDto;
    }

    @Override
    public boolean deleteBook(Long id) {

        try {
            bookRepository.deleteById(id);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public List<BookDto> getBookByTitre(String titre) {

        List<Book> books = bookRepository.findByTitre(titre);
        List<BookDto> bookDtos = new ArrayList<>();
        for (Book book : books) {
            bookDtos.add(bookMapper.fromBookToBookDto(book));
        }
        return bookDtos;
    }

    @Override
    public List<BookDto> saveBooks(List<BookDto> bookDtos) {

        List<Book> books = new ArrayList<>();
        for (BookDto bookDto : bookDtos) {
            books.add(bookMapper.fromBookDtoToBook(bookDto));
        }

        books = bookRepository.saveAll(books);

        bookDtos = new ArrayList<>();
        for (Book book : books) {
            bookDtos.add(bookMapper.fromBookToBookDto(book));
        }
        return bookDtos;
    }
    }

