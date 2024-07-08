package com.sparta.hanghaemarket.dto.response;

import com.sparta.hanghaemarket.entity.Post;
import lombok.Getter;

@Getter
public class PostCreateResponseDto {
    public Long id;
    private String username;
    private String title;
    private String content;
    private int price;

    public PostCreateResponseDto(Post post) {
        this.id = post.getId();
        this.username = post.getUsername();
        this.title = post.getTitle();
        this.content = post.getContent();
        this.price = post.getPrice();
    }
}
