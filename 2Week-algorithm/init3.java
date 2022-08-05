import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class init3 {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        int[] arr = {5, 9, 7, 10};
        int divisor= 5;

        int[] answer = s3.solution(arr, divisor);
        int[] answer2= s3.solutionB(arr, divisor);
        int[] answer3= s3.solutionC(arr, divisor);

        for (int i=0; i<answer.length; i++){
//            System.out.println(answer[i]);
//            System.out.println(answer2[i]);
            System.out.println(answer3[i]);
        }
    }
}

class Solution3 {

    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & divisor)== 0) cnt++;
        }

        if (cnt == 0) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[cnt];


        for (int i = 0, j = 0; i < arr.length; i++) {
            if ((arr[i] & divisor) == 0) answer[j++] = arr[i];
        }

        for (int i = 0; i < cnt - 1; i++) {
            for (int j = 0; j < cnt - 1; j++) {
                if (answer[j] > answer[j + 1]) {
                    int temp = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = temp;
                }
            }
        }

        return answer;
    }

    public int[] solutionB(int[] arr, int divisor){
        int[] answer= {};
        ArrayList<Integer> list= new ArrayList<Integer>();

        for (int i=0; i<arr.length; i++){
            if (arr[i] % divisor == 0) list.add(arr[i]);
        }

        if (list.isEmpty()) list.add(-1);

        answer= new int[list.size()];

        for (int i=0; i<list.size(); i++){
            answer[i]= list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }

    public int[] solutionC(int[] arr, int divisor) {
        List<Integer> list= new ArrayList<>();

        for (int e: arr){
            if (e % divisor == 0) list.add(e);
        }

        if (list.size() == 0) return new int[]{-1};

        int[] result= new int[list.size()];
        for(int i=0; i<list.size(); i++) result[i]= list.get(i);

        Arrays.sort(result);

        return result;
    }
}
