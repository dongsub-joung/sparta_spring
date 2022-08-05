//https://school.programmers.co.kr/learn/courses/30/lessons/12930?language=java

public class init5 {
    public static void main(String[] args) {
//        test
        String a= "abcd e";
        String[] arr= a.split("");
//        for (String e: arr) System.out.println(e);

        Solution5 s5= new Solution5();
        final String str= "try hello world";
        String result= s5.solution(str);
        System.out.println(result);
    }
}

class Solution5 {
    public String solution(String s) {

        String answer = "";
        int cnt = 0;
        String[] arr=s.split("");

        for (String ss: arr){
            cnt= ss.contains(" ") ? 0 : cnt+1;
            int condition= cnt%2;
            answer+= (condition == 0) ? ss.toLowerCase() : ss.toUpperCase();
        }

        return answer;
    }
}