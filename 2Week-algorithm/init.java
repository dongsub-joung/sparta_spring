//https://school.programmers.co.kr/learn/courses/30/lessons/12922?language=java

public class init {
    public static void main(String[] args) {
        Solution s = new Solution();
        StringBuffer result = new StringBuffer();
        result = s.solution(3);

        System.out.println(result);
    }
}


class Solution {
    public StringBuffer solution(int n) {
        final String str = "";
        final String one = "수";
        final String two = "박";

        StringBuffer sb = new StringBuffer(str);

        for (int i = 0; i < n; i++) {
            int cdt = i % 2;
            if (cdt == 0) {
                sb.append(one);
            }
            if (cdt == 1) {
                sb.append(two);
            }
        }
        return sb;
    }
}