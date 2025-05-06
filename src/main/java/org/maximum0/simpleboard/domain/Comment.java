package org.maximum0.simpleboard.domain;

import java.time.LocalDateTime;

public class Comment {
    private Long id;
    private Article article;
    private String content;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;
}
