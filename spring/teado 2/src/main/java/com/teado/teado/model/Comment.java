package com.teado.teado.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;


@Entity
@Table(name = "comments")
public class Comment {


    public Comment() {
    }

    public Comment(String title, String user, String comment, String date, String ticketNumber){
        this.title =title;
        this.user=user;
        this.comment=comment;
        this.date = date;
        this.ticketNumber = ticketNumber;

    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @Column(name = "comment")
    private String comment;
    @Column(name = "ticketNumber")
    private String ticketNumber;


    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Column(name = "title")
    private String title;
    @Column(name = "user")
    private String user;
    @Column(name = "date")
    private String date;





    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDate() {
        return date;
    }

    public void Date(String date) {
        this.date = date;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isPresent() {
       return true;
    }
}
