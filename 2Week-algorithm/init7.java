public class init6 {
    public static void main(String[] args) {
        final long N= 12345;

    }
}

class Solution6 {
    public int[] solution(long n) {
        int[] answer = {};
        String str= "" + n;
        char[] chars= str.toCharArray();

        return answer;
    }

    public int[] solutionB(long n){
        String str= ""+n;
        int[] answer= new int[str.length()];
        int cnt= 0;

        while (n>0){
            answer[cnt]= (int)(n%10);
            n/= 10;
            cnt++;
        }

        return answer;
    }
}
