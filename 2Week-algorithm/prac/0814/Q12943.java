public class Q12943 {
    public static void main(String[] args) {
//        8
        System.out.println(solution(6));
    }

//    case 5,7,10,11 -> x
    public static int solution(int num) {
        int answer = 0;
        for (int cnt=0; num>0; cnt++){
            if (num==1){
                answer= cnt;
                break;
            }

            if (num%2 == 0){
                num/= 2;
            } else{
                num=(num*3) + 1;
            }

            answer= cnt;

            if (cnt== 500) {
                answer= -1;
                break;
            };
        }
        return answer;
    }


    public int solutionB(int num) {
        long n = (long)num;
        for(int i =0; i<500; i++){
            if(n==1) return i;
            n = (n%2==0) ? n/2 : n*3+1;
        }
        return -1;
    }
}
