package com.teado.teado.controller;


import com.teado.teado.model.Ticket;
import com.teado.teado.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="http://localhost:8081")
@RestController
@RequestMapping("/api")
public class TicketController {

    @Autowired
    TicketRepository ticketRepository;

    @GetMapping("/tickets")
    public ResponseEntity<List<Ticket>> getAllTickets(@RequestParam(required = false) String title){

    }
    @GetMapping("/tickets/{id}")
    public ResponseEntity<Ticket> getTicketById(@PathVariable("id") long id){

    }
    @PostMapping("/tickets")
    public ResponseEntity<Ticket> createTicket(@RequestBody Ticket ticket){

    }

    @PutMapping("/tickets/{id}")
    public ResponseEntity<Ticket> updateTicket(@PathVariable("id") long id, @RequestBody Ticket ticket){

    }
    @DeleteMapping("/tickets/{id}")
    public ResponseEntity<HttpStatus> deleteTicket(@PathVariable("id") long id){

    }
    @DeleteMapping("/tickets")
    public ResponseEntity<HttpStatus> deleteAllTickets(){

    }




}
