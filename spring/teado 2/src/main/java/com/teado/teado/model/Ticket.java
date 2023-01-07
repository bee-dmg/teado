package com.teado.teado.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import com.teado.teado.types.Status;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private Status status;

    public Ticket(){

    }
    public Ticket(String title, String name, String email, String description){
        this.title =title;
        this.name=name;
        this.email=email;
        this.status = Status.OPEN;
        this.description=description;

    }

    public long getId() {
        return id;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return "Ticket [id="+ id + ", title="+title+", desc="+description+", email="+email+", name="+name;
    }
}
