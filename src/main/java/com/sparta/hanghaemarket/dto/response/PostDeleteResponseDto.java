package com.sparta.hanghaemarket.dto.response;

import lombok.Getter;

@Getter
public class PostDeleteResponseDto {
    private String msg;

    public PostDeleteResponseDto() {
        this.msg = "삭제완료";
    }
}
