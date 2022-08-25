package com.example.blogtoo.global.exception;

public interface ExceptionCase {
    void unableRefreshToken();
    void overlapNickname();
    void mismatchingPW();
    void notFoundUser();
    void mismatchingUserAuthInPost();
}
