package com.sparta.hanghaemarket.controller;

import com.sparta.hanghaemarket.dto.request.PostCreateRequestDto;
import com.sparta.hanghaemarket.dto.request.PostUpdateRequestDto;
import com.sparta.hanghaemarket.dto.response.PostCreateResponseDto;
import com.sparta.hanghaemarket.dto.response.PostDeleteResponseDto;
import com.sparta.hanghaemarket.dto.response.PostListResponseDto;
import com.sparta.hanghaemarket.dto.response.PostUpdateResponseDto;
import com.sparta.hanghaemarket.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("")
    public PostCreateResponseDto createPost(@RequestBody PostCreateRequestDto requestDto) {
        return postService.createPost(requestDto);
    }

    @GetMapping("")
    public List<PostListResponseDto> getPosts() {
        return postService.getPosts();
    }

    @PutMapping("/{id}")
    public PostUpdateResponseDto updatePost(@PathVariable Long id, @RequestBody PostUpdateRequestDto requestDto) {
        return postService.updatePost(id, requestDto);
    }

    @DeleteMapping("/{id}")
    public PostDeleteResponseDto deletePost(@PathVariable Long id) {
        return postService.deletePost(id);
    }
}
