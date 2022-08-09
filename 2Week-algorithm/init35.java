public class init35 {

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        int[] container= new int[n];
//        2진수로 표현된 두 비트 중 하나라도 1일 경우에 연산 결과가 1로 표현됨.
        for (int i=0; i<n; i++)
            container[i] = arr1[i] | arr2[i];

        String[] answer= new String[n];
        for (int i=0; i<n; i++){
            String ans= "";
            int remainder= container[i];

            for (int j=0; j<n; j++){
                if (remainder % 2 == 1)
                    ans= "#"+ ans;
                else
                    ans= " "+ ans;

                remainder/= 2;
            }

            answer[i]= ans;
        }

        return answer;
    }


    public static String[] mySolution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        int[][] int_array1;
        int[][] int_array2;
        int[][] sum= new int[n][n];

        int_array1= paintWall(arr1, n);
        int_array2= paintWall(arr2, n);

        for (int i= 0; i<n; i++){
            for (int j= 0; j<n; j++){
                sum[i][j]= int_array1[i][j] + int_array2[i][j];
            }
        }

        for (int[] list: sum){
            for (int e: list)
                System.out.println("");
        }


        return answer;
    }

    public static int[][] paintWall(int[] arr, int n){
        int[][] int_array= new int[n][n];

        for (int idx=0; idx<n; idx++){
            String str;
            if (arr[idx]<20){
                str= "0" + Integer.toBinaryString(arr[idx]);
            }else {
                str= Integer.toBinaryString(arr[idx]);
            }

            char[] elements= str.toCharArray();
            for (int j=0; j<n; j++){
                int_array[idx][j]= Integer.parseInt("" + elements[j]);
            }
        }

        return int_array;
    }

    public static void main(String[] args) {
        final int N= 5;
        final int[] ARR1= {9, 20, 28, 18, 11};
        final int[] ARR2= {30, 1, 21, 17, 28};
//        mySolution(N, ARR1, ARR2);
        System.out.println(solution(N, ARR1, ARR2));

        final int N2= 6;
        final int[] ARRB1= {46, 33, 33 ,22, 31, 50};
        final int[] ARRB2= {27 ,56, 19, 14, 14, 10};
    }
}
