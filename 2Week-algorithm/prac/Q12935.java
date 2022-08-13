import java.util.*;

public class Q12935 {
    public static void main(String[] args) {
        final int[] ARR= {4,3,2,1};
        final int[] ARR2= {10};

//        [4,3,2]
        System.out.println(Arrays.toString(solution(ARR)));
        System.out.println(Arrays.toString(solutionB(ARR)));

//        -1
        System.out.println(Arrays.toString(solution(ARR2)));
    }


//    [0, 0, 0]
    public static int[] solution(int[] arr) {
        int[] answer;
        Arrays.sort(arr);

        if (arr.length <= 1){
            answer= new int[]{-1};
        }else {
            int len= arr.length;
            answer= new int[len-1];
            for (int i=len, j=0; i<=1; i--,j++)
                answer[j]= arr[i];
        }

        return answer;
    }

    public static int[] solutionB(int[] arr) {
        int[] answer;

        if (arr.length <= 1){
            answer= new int[]{-1};
        }

        int min= arr[0];
        for (int i=1; i<arr.length; i++)
            min= Math.min(min, arr[i]);

        int idx= 0;

        answer = new int[arr.length-1];
        for (int i=0; i< arr.length; i++){
            if (arr[i] == min)
                continue;
            answer[idx++]= arr[i];
        }

        return answer;
    }

    public int[] solutionC(int[] arr) {
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        } else {
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            for (int a : arr) {
                arrayList.add(a);
            }
            Integer minimum = Collections.min(arrayList);
            arrayList.remove(minimum);
            int[] resultArray = new int[arr.length - 1];
            for (int i = 0; i < arrayList.size(); ++i) {
                resultArray[i] = arrayList.get(i);
            }
            return resultArray;
        }
    }
}
