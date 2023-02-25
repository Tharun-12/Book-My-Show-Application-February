package com.example.Book_my_Show_Application_February.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name="tickets")
public class TicketEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String movieName;

    private LocalDate showDate;

    private LocalTime showTime;

    private int totalAmount;

    private String ticket = UUID.randomUUID().toString();

    private String theaterName;


    @ManyToOne
    @JoinColumn
    private UserEntity userEntity;

    // wrt to show entity

    @ManyToOne
    @JoinColumn
    private ShowEntity showEntity;



}
