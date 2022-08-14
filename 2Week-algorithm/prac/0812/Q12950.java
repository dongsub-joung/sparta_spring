import java.util.Arrays;

public class Q12950 {
    public static void main(String[] args) {
        int[][] arr1= {{1,2},{2,3}}, arr2= {{3,4},{5,6}};

//        Some way
//        int row = Math.max(A.length, B.length);
//        int col = Math.max(A[0].length, B[0].length);

//        result= {{4,6},{7,9}}
        System.out.println(Arrays.deepToString(solution(arr1,arr2)));
    }

    protected static int[][] solution(int[][] arr1, int[][] arr2) {
        final int OUTER_SIZE= arr1.length;
        final int INNER_SIZE= arr1[0].length;
        int[][] answer = new int[OUTER_SIZE][INNER_SIZE];

        for (int i=0; i< OUTER_SIZE; i++){
            for (int j=0; j< INNER_SIZE; j++){
                answer[i][j]= arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }

    protected static int[][] solutionB(int[][] arr1, int[][] arr2) {
        int[][] answer= {};
        answer= arr1;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++) {
                answer[i][j]+= arr2[i][j];
            }
        }
        return answer;
    }


}
