package org.maximum0.simpleboard.repository;

import org.maximum0.simpleboard.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
