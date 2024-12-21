package org.sid.devoir_surveille.web;


import lombok.AllArgsConstructor;
import org.sid.devoir_surveille.dto.BookDto;
import org.sid.devoir_surveille.service.BookService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;


@Controller
@AllArgsConstructor
public class BookGraphqlController {
    private BookService bookService ;

    @MutationMapping
    public BookDto saveBook(@Argument BookDto Book){
        return bookService.saveBook(Book);
    }

    @MutationMapping
    public Boolean deleteBook(@Argument Long id){
        return bookService.deleteBook(id);
    }


    @QueryMapping
    public List<BookDto> getBookByTitre(@Argument String titre){
        return bookService.getBookByTitre(titre);
    }




}
