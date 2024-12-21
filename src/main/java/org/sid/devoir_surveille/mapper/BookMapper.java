package org.sid.devoir_surveille.mapper;

import org.modelmapper.ModelMapper;
import org.sid.devoir_surveille.dao.entities.Book;
import org.sid.devoir_surveille.dto.BookDto;

public class BookMapper {
    private final ModelMapper mapper = new ModelMapper();
    public Book fromBookDtoToBook(BookDto bookDto){return mapper.map(bookDto, Book.class);
    }

    public BookDto fromBookToBookDto(Book Book){return mapper.map(Book, BookDto.class);
    }


}
