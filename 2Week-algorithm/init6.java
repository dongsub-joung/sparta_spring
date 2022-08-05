//https://school.programmers.co.kr/learn/courses/30/lessons/12931

//자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.

public class init6 {
    public static void main(String[] args) {
        final int ONE= 123;
        final int TWO= 987;

        int result1= Solution6.solutionA(ONE);
        int result2= Solution6.solutionB(TWO);

        System.out.println(result1);
        System.out.println(result2);
    }
}

class Solution6 {
    public static int solutionA(int n) {
        int answer = 0;

        while(n > 0){
            answer += n%10;
            n/=10;
        }
        return answer;
    }

    public static int solutionB(int n){
        int answer= 0;
        String str= Integer.toString(n);

        String num= new String();
        for (int i=0; i< str.length(); i++)
            answer+= Integer.parseInt(str.substring(i, i+1));
        return answer;
    }
}
