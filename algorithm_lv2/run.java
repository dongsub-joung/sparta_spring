//https://school.programmers.co.kr/learn/courses/30/lessons/12939?language=java


import java.util.ArrayList;


public class run {
    public static void main(String[] args) {
        Solution solution= new Solution();
        String a= solution.solution("1 2 3 4");
        assert a.equals("1 4");

        String b= solution.solution("-1 -2 -3 -4" );
        assert b.equals("-4 -1");

        String c= solution.solution("-1 -1");
        assert b.equals("-1 -1");
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";
        var list= s.split(" ");
        ArrayList<Long> arrayList= new ArrayList<>();
        for(String element : list){
            arrayList.add(Long.valueOf(element));
        }

        Long min = Long.MAX_VALUE, max= Long.MIN_VALUE;
        for (int i=0; i< arrayList.size(); i++){
            min= Math.min(arrayList.get(i), min);
            max= Math.max(arrayList.get(i), max);
        }

        answer=+ min + " " + max;

        return answer;
    }
}

