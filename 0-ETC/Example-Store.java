import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    record Books(String title, int price) {
    }

    private ArrayList<Books> generateEachBookInfo(Store storeA) {

        Books book_A= storeA.setBook();
        Books book_B= storeA.setBook();

        ArrayList<Books> book_list= storeA.addEachBookAtTheList(book_A, book_B);

        return book_list;
    }

    private ArrayList<Books> addEachBookAtTheList(Books ...books ) {
        ArrayList<Books> book_list= new ArrayList<>();

        for (var a_book: books){
            book_list.add(a_book);
        }

        return book_list;
    }

    private String setTitle() {
        System.out.println("set Title");
        Scanner sc= new Scanner(System.in);
        String title= sc.nextLine();
//        sc.close();
        return title;
    }
    private int setPrice() {
        System.out.println("Set price");
        Scanner sc= new Scanner(System.in);
        int pricce= Integer.parseInt(sc.nextLine());
//        sc.close();
        return pricce;
    }

    public Books setBook() {
        return new Books(this.setTitle(), this.setPrice());
    }



//    Init
    public static void main(String[] args) {
        Store storeA= new Store();
//        Store storeB= new Store();

        ArrayList<Books> A_store_bookList= storeA.generateEachBookInfo(storeA);
//        ArrayList<Books> B_store_bookList= storeB.generateEachBookInfo(storeA);

        A_store_bookList.forEach(
                (n) -> {
                    System.out.println("n.title = " + n.title);
                    System.out.println("book.price = " + n.price);
                }
        );

    }
}

