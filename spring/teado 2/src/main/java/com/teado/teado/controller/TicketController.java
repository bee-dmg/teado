package com.teado.teado.controller;


import com.teado.teado.model.Ticket;
import com.teado.teado.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins="http://localhost:8081")
@RestController
@RequestMapping("/api")
public class TicketController {

    @Autowired
    TicketRepository ticketRepository;

    @GetMapping("/tickets")
    public ResponseEntity<List<Ticket>> getAllTickets(@RequestParam(required = false) String title) {
        try {
            List<Ticket> tickets = new ArrayList<Ticket>();
            if (title == null) {
                ticketRepository.findAll().forEach(tickets::add);
            } else {
                ticketRepository.findByTitleContaining(title).forEach(tutorials:add);
            }

            if (tickets.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(tickets, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
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
