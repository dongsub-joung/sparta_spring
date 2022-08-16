package com.example.blogtoo.domain;

import lombok.Getter;

@Getter
public class PostRequestDto {

    private String doc_title;
    private String user_name;
    private String content;
    private String password;
}
