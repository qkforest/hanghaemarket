package com.sparta.hanghaemarket.dto.request;

import lombok.Getter;

@Getter
public class PostUpdateRequestDto {
    private String title;
    private String content;
    private int price;
    private String username;
}
