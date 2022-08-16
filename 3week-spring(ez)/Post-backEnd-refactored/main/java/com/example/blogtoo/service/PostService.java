package com.example.blogtoo.service;

import com.example.blogtoo.domain.Post;
import com.example.blogtoo.domain.PostRequestDto;
import com.example.blogtoo.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public List<Post> sortPostAtTheDateToDESC() {
        return postRepository.findAll(Sort.by(Sort.Direction.DESC, "createAt"));
    }

    public Optional<Post> findId(Long id) {
        return postRepository.findById(id);
    }

    public Post savePostInDb(PostRequestDto requestDto) {
        return postRepository.save(new Post(requestDto));
    }

    public Post getThePostInIndex(Long id) {
        return this.findId(id).orElseGet(
                () -> {
                    System.err.println("Cant find the id");
                    return null;
                }
        );
    }

    public void delete(Long id) {
        postRepository.deleteById(id);
    }
    @Transactional
    public Long update(Long id, PostRequestDto postRequestDto){
        Post post= this.findTheCaseID(id);
        post.update(postRequestDto);
        return this.ResponsePrintingData(post);
    }

    public Post findTheCaseID(Long id) {
        return postRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("no data")
        );
    }

    private Long ResponsePrintingData(Post post) {
        return post.getId();
    }
}
