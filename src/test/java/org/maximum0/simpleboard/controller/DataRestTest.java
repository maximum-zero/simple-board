package org.maximum0.simpleboard.controller;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Disabled("Spring Data REST 통합 테스트는 불필요하므로 제외")
@DisplayName("Data REST - API 테스트")
@Transactional
@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class DataRestTest {
    
    private final MockMvc mvc;

    public DataRestTest(@Autowired MockMvc mvc) {
        this.mvc = mvc;
    }

    @DisplayName("[API] 게시글 목록 조회")
    @Test
    void givenNothing_whenRequestingArticles_thenReturnArticlesJsonResponse() throws Exception {
        // Given

        // When & Then
        mvc.perform(get("/api/articles"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/hal+json")));
    }

    @DisplayName("[API] 게시글 상세 조회")
    @Test
    void givenNothing_whenRequestingArticle_thenReturnArticlesJsonResponse() throws Exception {
        // Given

        // When & Then
        mvc.perform(get("/api/articles/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/hal+json")));
    }

    @DisplayName("[API] 게시글 -> 댓글 목록 조회")
    @Test
    void givenNothing_whenRequestingCommentFromArticle_thenReturnArticlesJsonResponse() throws Exception {
        // Given

        // When & Then
        mvc.perform(get("/api/articles/5/comments"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/hal+json")));
    }

    @DisplayName("[API] 댓글 목록 조회")
    @Test
    void givenNothing_whenRequestingComments_thenReturnArticlesJsonResponse() throws Exception {
        // Given

        // When & Then
        mvc.perform(get("/api/comments"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/hal+json")));
    }

    @DisplayName("[API] 댓글 상세 조회")
    @Test
    void givenNothing_whenRequestingComment_thenReturnArticlesJsonResponse() throws Exception {
        // Given

        // When & Then
        mvc.perform(get("/api/comments/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/hal+json")));
    }
}
