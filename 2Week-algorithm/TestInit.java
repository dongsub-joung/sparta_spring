public class TestInit {
    public static int solution(int[] arr1, int[] arr2) {
        int time= 0;

        final int WEEK= 7;
        for (int i=0; i< WEEK; i++){
            final int LIMIT= 29;

            int check_out= arr2[i];
            int check_in= arr1[i];

            if (check_out >= LIMIT){
                time+= 21 - check_in;
            }else{
                time+= check_out-check_in;
            }
        }
        return time;
    }

    public static void main(String[] args) {
        System.out.println("TestCase 001");
        int[] arr1 = {9, 9, 9, 9, 7, 9, 8};
        int[] arr2 = {23, 23, 30, 28, 30, 23, 23};
        System.out.println(solution(arr1, arr2));

        System.out.println("TestCase 002");
        int[] arrB1= {9, 9, 8, 8, 7, 8, 9};
        int[] arrB2= {21, 25, 30, 29, 22, 23, 30};
        System.out.println(solution(arrB1, arrB2));

        System.out.println("TestCase 003");
        int[] arrC1= {9, 7, 8, 9, 7, 9, 8};
        int[] arrC2= {23, 22, 26, 26, 29, 27, 22};
        System.out.println(solution(arrC1,arrC2));
    }
}
