package com.sparta.hanghaemarket.dto.response;

import com.sparta.hanghaemarket.entity.Post;
import lombok.Getter;

@Getter
public class PostUpdateResponseDto {
    public Long id;
    private String title;
    private String content;
    private int price;
    private String username;

    public PostUpdateResponseDto(Post post) {
        this.id = post.getId();
        this.title = post.getTitle();
        this.content = post.getContent();
        this.price = post.getPrice();
        this.username = post.getUsername();
    }
}
