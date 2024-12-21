package org.sid.devoir_surveille.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;




@Entity
@Getter @Setter
@Data @NoArgsConstructor @AllArgsConstructor @ToString @Builder
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_book;
    private String titre;
    private String publisher;
    private Date datePublication;
    private double price;
    private String resume;

}
