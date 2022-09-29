
public class Run09_28 {
    public static void main(String[] args) {
        String a= "3people unFollowed me";
        String b= "for the last week";

        Solution solution= new Solution();

        var A= solution.solution(a);
        System.out.println(A);
        assert A.equals("3people Unfollowed Me");

        var B= solution.solution(b);
        System.out.println(B);
        assert B.equals("For The Last Week");

    }
}

class Solution {
    public String solution(String s) {
        String answer = "";

        String[] spliting= s.split(" ");
        int cnt= 0;
        for(var e : spliting){
            int len= spliting.length;

            String first= String.valueOf(e.charAt(0)).toUpperCase();
            String sub= e.substring(1).toLowerCase();

            if (len-1 == cnt){
                answer+= first + sub;
                break;
            }
            answer+= first + sub + " ";
            cnt++;
        }

        return answer;
    }
}

class Solution2 {
    public String solution(String s) {
        String answer = "";
        String[] sp = s.split(" "); // 공백을 기준으로 문자열 자르기

        // 공백을 기준으로 잘려진 문자열의 수만큼 반복
        for(int i = 0; i < sp.length; i++){
            if(sp[i].length() == 0) answer += " "; // 단어가 공백일 경우 반환값에 공백 더하기
            else{
                answer += sp[i].substring(0, 1).toUpperCase(); // 단어 첫번째 대문자로 변환하여 더하기
                answer += sp[i].substring(1, sp[i].length()).toLowerCase(); // 첫글자를 제외하고 소문자로 변환하여 더하기
                answer += " "; // 띄어쓰기
            }

        }

        //원래 문자열 마지막이 공백일 경우 그대로 answer 반환
        if(s.substring(s.length() -1, s.length()).equals(" ")) return answer;
        //마지막에 공백이 더해져서 그 공백을 제외한 answer값 반환
        return answer.substring(0, answer.length() - 1);
    }
}

class Solution3 {
    public String solution(String s){
            String answer= "";

            String[] sp= s.toLowerCase().split("");
            boolean flag= true;

            for (var ss : sp){
                answer += flag ? ss.toUpperCase() : ss;
                flag= ss.equals(" ") ? true : false;
            }

            return answer;
        }
}