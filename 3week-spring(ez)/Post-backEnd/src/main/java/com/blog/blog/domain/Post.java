package com.blog.blog.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Post extends Timestamped{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String doc_title;

    @Column(nullable = false)
    private String user_name;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String password;


    public Post(PostRequestDto postRequestDto) {
        this.password= postRequestDto.getPassword();
        this.doc_title = postRequestDto.getDoc_title();
        this.user_name = postRequestDto.getUser_name();
        this.content = postRequestDto.getContent();
    }

    public void update(PostRequestDto postRequestDto) {
        this.password= postRequestDto.getPassword();
        this.doc_title = postRequestDto.getDoc_title();
        this.user_name = postRequestDto.getUser_name();
        this.content = postRequestDto.getContent();
    }
}
