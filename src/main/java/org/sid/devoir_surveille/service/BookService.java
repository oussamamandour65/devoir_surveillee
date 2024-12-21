package org.sid.devoir_surveille.service;

import org.sid.devoir_surveille.dto.BookDto;

import java.util.List;

public interface BookService {
    public BookDto saveBook(BookDto bookDto);

    public boolean deleteBook(Long id);

    public List<BookDto> getBookByTitre(String titre);

    public List<BookDto> saveBooks(List<BookDto> bookDtos);

}
