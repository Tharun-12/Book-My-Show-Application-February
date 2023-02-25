package com.example.Book_my_Show_Application_February.Entities;

import com.example.Book_my_Show_Application_February.Genre.Genre;
import com.example.Book_my_Show_Application_February.Genre.Language;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name ="movie")
@Data
public class MovieEntity
{
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true,nullable = false)
    private String MovieName;

    private Genre genre;

    private double rating;

    private double duration;

    @Enumerated(value = EnumType.STRING)
    private Language language;


    // This is parent wrt to ShowEntity
     @OneToMany(mappedBy = "movieEntity",cascade = CascadeType.ALL)
     private List<ShowEntity> showEntityList;


    // This is parent to theaterSeats
    @OneToMany(mappedBy = "theaterEntity",cascade = CascadeType.ALL)
    private List<TheaterSeatEntity> theaterSeatEntityArrayList;



}
