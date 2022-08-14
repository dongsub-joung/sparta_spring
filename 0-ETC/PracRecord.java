import java.util.Arrays;

public class PracRecord {
    public static void main(String[] args) {
        String[] array = {"Paris", "Seoul", "Tokyo", "Washington"};
//        showArrayContent(array);
        Person person1= new Person("jds", 22);
        System.out.println(person1.name);


    }

    private static void showArrayContent(String[] array) {
        Arrays.stream(array).forEach(System.out::println);
    }

    public record Person(String name, int age){
        public Person{
            System.out.println("new person");
        }
    }
}
