package com.example.demo;

import java.util.Arrays;

public class Test01 {
    public int[][] solution(int[][] arr1, int[][] arr2, boolean[][] signs) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i=0; i< arr1.length; i++){
            for (int j=0; j< arr1[0].length; j++){
                if (signs[i][j])
                    answer[i][j]= arr1[i][j] + arr2[i][j];
                else
                    answer[i][j]= (-arr1[i][j]) + (-arr2[i][j]);
            }
        }
        return answer;
    }
}