package com.example.multiplex.Reservation.DTO;


import com.example.multiplex.Reservation.TicketType;

public class SeatDTO {

      Long id;
      char row;
      int seatNumber;
      int roomNumber;
      boolean taken;
      Long screeningfk;
      TicketType ticketType;


     public Long getid() {
          return this.id;
     };
     public TicketType getTicketType(){
          return this.ticketType;
     };

}
