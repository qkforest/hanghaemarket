package com.sparta.hanghaemarket.dto.request;

import lombok.Getter;

@Getter
public class PostCreateRequestDto {
    private String username;
    private String title;
    private String content;
    private int price;
}
