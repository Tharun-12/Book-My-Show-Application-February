package com.example.Book_my_Show_Application_February.Entities;

import com.example.Book_my_Show_Application_February.Genre.ShowType;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="shows")
@Data

public class ShowEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private LocalDate showDate;

   private LocalTime showTime;

   @Enumerated(value=EnumType.STRING)
   private ShowType showType;

   @CreationTimestamp
   private Date createdOn;

   @UpdateTimestamp
   private Date updatedOn;


   // child wrt movie

    @ManyToOne
    @JoinColumn
    private MovieEntity movieEntity;


    @ManyToOne
    @JoinColumn
    private TheaterEntity theaterEntity;

    //Show parent  wrt to ticket
    @OneToMany(mappedBy = "showEntity", cascade = CascadeType.ALL)
   private List<TicketEntity> listOfBookedTickets;


    @OneToMany(mappedBy = "showEntity",cascade = CascadeType.ALL)
    private List<ShowSeatEntity> listOfShowSeats;

}
