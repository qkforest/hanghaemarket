package com.sparta.hanghaemarket.dto.response;

import com.sparta.hanghaemarket.entity.Post;
import lombok.Getter;

@Getter
public class PostListResponseDto {
    public Long id;
    private String title;
    private String username;
    private int price;

    public PostListResponseDto(Post post) {
        this.id = post.getId();
        this.title = post.getTitle();
        this.username = post.getUsername();
        this.price = post.getPrice();
    }
}
