package com.blog.blog.controller;

import com.blog.blog.domain.Post;
import com.blog.blog.domain.PostRepository;
import com.blog.blog.domain.PostRequestDto;
import com.blog.blog.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;
    private final PostRepository postRepository;

    @GetMapping("/api/postAll")
    public List<Post> getAllDoc(){
        return postRepository.findAll(Sort.by(Sort.Direction.DESC, "createdAt"));
    }

    @GetMapping("/api/posts/{id}")
    public Optional<Post> getPerDoc(@PathVariable Long id){
        return postRepository.findById(id);
    }

    @PostMapping("/api/posts/add")
    public Post createDoc(@RequestBody PostRequestDto requestDto){
        Post post = new Post(requestDto);
        return postRepository.save(post);
    }

//
    @PostMapping("/api/posts/{id}/pw")
    public boolean checkPW(@PathVariable Long id, @RequestBody PostRequestDto requestDto){
        var find_id= postRepository.findById(id).get();

        String pre_pw= "";
        String is_inputed_PW= "";

        try {
            pre_pw= find_id.getPassword();
        }catch (NoSuchElementException e){
            System.err.println("pre_pw is null");
        }

        try{
            is_inputed_PW= requestDto.getPassword();
        }catch (NoSuchElementException e){
            System.err.println("is_inputed_PW is null");
        }


        if (pre_pw.equals(is_inputed_PW)){
            return true;
        }else{
            return false;
        }
    }

    @PutMapping("/api/posts/{id}")
    public Long updateDoc(@PathVariable Long id, @RequestBody PostRequestDto postRequestDto){
        return postService.update(id, postRequestDto);
    }

    @DeleteMapping("/api/posts/{id}")
    public Long deleteDoc(@PathVariable Long id){
        postRepository.deleteById(id);
        return id;
    }

}
