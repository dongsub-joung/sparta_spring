public class init21 {
    public static void main(String[] args) {

    }

    public static int solution(int[] nums) {
        int answer = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    answer += isPrime(sum) ? 1 : 0;
                }
            }
        }
        return answer;
    }
    protected static boolean isPrime(int n){
        for (int i =2; i<= Math.sqrt(n); i++){
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
