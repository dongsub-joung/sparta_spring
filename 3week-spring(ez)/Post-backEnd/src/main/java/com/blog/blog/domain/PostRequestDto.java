package com.blog.blog.domain;

import lombok.Getter;

@Getter
public class PostRequestDto {
    private Long id;
    private String doc_title;
    private String user_name;
    private String content;
    private String password;
}
