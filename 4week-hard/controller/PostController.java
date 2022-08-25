package com.example.blogtoo.controller;

import com.example.blogtoo.domain.Post;
import com.example.blogtoo.domain.PostRequestDto;
import com.example.blogtoo.repository.PostRepository;
import com.example.blogtoo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("/posts")
    public List<Post> getAllPost(){
        return postService.sortPostAtTheDateToDESC();
    }

    @GetMapping("/posts/{id}")
    public Optional<Post> getPost(@PathVariable Long id){
        return postService.findId(id);
    }


    @PostMapping("/posts")
    public Post createPost(@RequestBody PostRequestDto requestDto){
        return postService.savePostInDb(requestDto);
    }


    @PostMapping("/posts/{id}/pw")
    public boolean checkPW(@PathVariable Long id, @RequestBody PostRequestDto requestDto){
        String pw_in_DB= postService.getThePostInIndex(id).getPassword();
        String is_inputed_PW= this.getIs_inputed_pw(requestDto);

        return (pw_in_DB.equals(is_inputed_PW)) ? true : false;
    }
    private String getIs_inputed_pw(PostRequestDto requestDto) {
        String is_inputed_PW= "";
        try{
            is_inputed_PW = requestDto.getPassword();
        }catch (NoSuchElementException e){
            System.err.println("is_inputed_PW is null");
        }
        return is_inputed_PW;
    }


    @PutMapping("/posts/{id}")
    public Long updateDoc(@PathVariable Long id, @RequestBody PostRequestDto postRequestDto){
        return postService.update(id, postRequestDto);
    }

    @DeleteMapping("/posts/{id}")
    public String deleteDoc(@PathVariable Long id){
        postService.delete(id);
        return id + ": successfully removed";
    }

}
