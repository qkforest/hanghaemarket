package com.sparta.hanghaemarket.service;

import com.sparta.hanghaemarket.dto.request.PostCreateRequestDto;
import com.sparta.hanghaemarket.dto.request.PostUpdateRequestDto;
import com.sparta.hanghaemarket.dto.response.PostCreateResponseDto;
import com.sparta.hanghaemarket.dto.response.PostDeleteResponseDto;
import com.sparta.hanghaemarket.dto.response.PostListResponseDto;
import com.sparta.hanghaemarket.dto.response.PostUpdateResponseDto;
import com.sparta.hanghaemarket.entity.Post;
import com.sparta.hanghaemarket.repository.PostRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public PostCreateResponseDto createPost(PostCreateRequestDto requestDto) {
        Post post = new Post(requestDto);
        Post savePost = postRepository.save(post);
        return new PostCreateResponseDto(savePost);
    }

    public List<PostListResponseDto> getPosts() {
        return postRepository.findAll().stream().map(PostListResponseDto::new).toList();
    }

    @Transactional
    public PostUpdateResponseDto updatePost(Long id, PostUpdateRequestDto requestDto) {
        Post post = findPost(id);
        post.update(requestDto);
        return new PostUpdateResponseDto(post);
    }

    public PostDeleteResponseDto deletePost(Long id) {
        Post post = findPost(id);
        postRepository.delete(post);
        return new PostDeleteResponseDto();
    }

    public Post findPost(Long id) {
        return postRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("선택한 게시글은 존재하지 않습니다."));
    }

}
