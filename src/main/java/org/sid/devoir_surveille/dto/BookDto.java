package org.sid.devoir_surveille.dto;

import lombok.*;

import java.util.Date;


@Getter @Setter
@Data @NoArgsConstructor @AllArgsConstructor @ToString @Builder
public class BookDto {
    private String titre;
    private String publisher;
    private Date datePublication;
    private double price;
    private String resume;
}
