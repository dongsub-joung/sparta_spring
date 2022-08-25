package com.example.blogtoo.User;

import lombok.Getter;

@Getter
public class UserRequestDto {
    private String user_name;
    private String user_PW;

    public UserRequestDto() {
//        regular expression
//        @todo 최소 4자 이상, 12자 이하 알파벳 대소문자(a~z, A~Z), 숫자(0~9)
//        @todo 최소 4자 이상이며, 32자 이하 알파벳 소문자(a~z), 숫자(0~9)
    }
}


