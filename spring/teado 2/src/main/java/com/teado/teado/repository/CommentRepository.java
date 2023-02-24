package com.teado.teado.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.teado.teado.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{
    List<Comment> findByTitleContaining(String title);
    List<Comment> findById(int id);

    Optional<Comment> findByTicketNumber(String ticketNumber);


}
