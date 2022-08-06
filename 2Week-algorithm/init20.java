import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class init20 {
    public static void main(String[] args) {
        String str= "Zbcdefg";

        System.out.println(Sol20.solA(str));
        System.out.println(Sol20.reverseStr(str));
    }
}

class Sol20 {
    protected static String solA(String str) {
        char[] arr= str.toCharArray();
        Arrays.sort(arr);
        StringBuffer sb= new StringBuffer(new String(arr));
        return sb.reverse().toString();
    }

    public static  String reverseStr(String str){
        return Stream.of(str.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
    }
}