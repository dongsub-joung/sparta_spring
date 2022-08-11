package com.example.demo;

import java.util.Arrays;

public class Main {
    public String solution(int n) {
        String answer = "";
        int sum=0;
        while (n > 0){
            sum+= (n%10);
            if (n < 10)
                answer+= (n%10)+"=" + sum;
            else {
                answer+= (n%10)+"+";
            }
            n/= 10;
        }
        return answer;
    }
}
