import java.util.Arrays;

public class test {
    public static void main(String[] args) {
//        stringConvertIntegerAsAuto();
//        autoConvert3To10();
        stringOffset();
    }

    static void stringOffset(){
        String str= "cbae";
        char[] arr= str.toCharArray();
        Arrays.sort(arr);
        StringBuffer sb= new StringBuffer("vvvvvv");
        System.out.println(sb.toString());
    }
    static void autoConvert3To10(){
        int N= 45;
        String answer= new String();

        while (N>=3){
//            answer는 문자열 (문자열에 쌓임)
            answer= answer + (N%3);
            N/= 3;
        }
        answer+= N;
        System.out.println(answer);

//        Stirng 전체를 하나의 정수로 인식하는 듯
        int result= Integer.parseInt(answer, 3);
        System.out.println(result);
    }

    static void stringConvertIntegerAsAuto(){
        final long N= 53412;
        String str= String.valueOf(N);
        String[] list= str.split("");

        for (String s: list) System.out.print(s);

        Arrays.sort(list);
        System.out.println("");

        for (String s: list) System.out.print(s);
    }
}
