package com.example.Book_my_Show_Application_February.Entities;

import com.example.Book_my_Show_Application_February.Genre.SeatType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="theater_seats")
@Data
@NoArgsConstructor
public class TheaterSeatEntity
{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private SeatType seatType;

    private String seatNo;

// child wrt to Theater Entity
    @ManyToOne
    @JoinColumn
    private TheaterEntity theaterEntity;
}
