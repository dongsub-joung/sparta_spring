package com.example.blogtoo.domain;

import com.example.blogtoo.User.UserRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String user_name;

    @Column(nullable = false)
    private String user_PW;

    public User(UserRequestDto userRequestDto) {
        this.user_name = userRequestDto.getUser_name();
        this.user_PW = userRequestDto.getUser_PW();
    }
}
