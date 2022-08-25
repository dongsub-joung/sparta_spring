package com.example.blogtoo.service;

import com.example.blogtoo.User.UserRequestDto;
import com.example.blogtoo.domain.User;
import com.example.blogtoo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    private static final String ADMIN_TOKEN = "AAABnv/xRVklrnYxKZ0aHgTBcXukeZygoC";

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(UserRequestDto requestDto) {
        String username = requestDto.getUser_name();
        String password = requestDto.getUser_PW();
        // 회원 ID 중복 확인
        Optional<User> found = userRepository.findById(username);
        if (found.isPresent()) {
            throw new IllegalArgumentException("중복된 사용자 ID 가 존재합니다.");
        }

//        @todo ID, PW 체크하고 객체 만들고
        User user = new UserRequestDto(username, password);
        userRepository.save(user);
    }
}
