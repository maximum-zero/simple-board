package org.maximum0.simpleboard.repository;

import org.maximum0.simpleboard.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
