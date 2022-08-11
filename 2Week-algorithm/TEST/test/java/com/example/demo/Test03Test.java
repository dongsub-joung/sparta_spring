package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Test03Test {


    @Test
    @DisplayName("2번 문제 테스트 코드")
    void test1(){
        Main method= new Main();
        assertEquals("3+5+2+8+1+7=26", method.solution(718253));
        assertEquals("6+7+5+2+3+5+1=29", method.solution(1532576));
    }
    
    @Test
    @DisplayName("1번 문제 테스트 코드")
    void test2(){
        Test01 method= new Test01();
        int[][] arr1 = {{5,7,1},{2,3,5}};
        int[][] arr2 = {{5,1,6},{7,5,6}};
        boolean[][] signs={{true,true,false},{false,true,false}};

//        Arrays.deepToString
        int[][] except= {{10,8,-7},{-9,8,-11}};
        int[][] result= (method.solution(arr1, arr2, signs));
        assertEquals(except ,result);
    }
}