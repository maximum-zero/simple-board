package org.maximum0.simpleboard.repository;

import org.maximum0.simpleboard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}