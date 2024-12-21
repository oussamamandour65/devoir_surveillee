package org.sid.devoir_surveille;

import org.sid.devoir_surveille.dto.BookDto;
import org.sid.devoir_surveille.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DevoirsurveilleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevoirsurveilleApplication.class, args);
    }
    @Bean
    CommandLineRunner Start(BookService bookService) {
        return args -> {
            bookService.saveBooks(
                    List.of(
                            BookDto.builder().titre("aaaa").publisher("bbbb").price(12345).resume("cccc").build(),
                            BookDto.builder().titre("mmmm").publisher("lllll").price(65489).resume("rrrrr").build(),
                            BookDto.builder().titre("ooo").publisher("hhhh").price(89789).resume("rrrrr").build(),
                            BookDto.builder().titre("pppp").publisher("wrdqwqw").price(555).resume("eeeee").build()

                    )
            );

        };
    }

}
