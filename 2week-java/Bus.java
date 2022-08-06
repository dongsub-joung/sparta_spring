public class Bus{
    int max_people, current_people;
    int bill;
    String car_number;
    int oil_percent;
    int speed;
    boolean run;
    String current_bus_stop;
    String next_bus_stop;

    Bus(){
        current_people= 0;
        max_people= 30;
        bill= 500;
        car_number= RandomGenerator.char_init()
                + RandomGenerator.number_init();
        oil_percent= 90;
        speed= 60;
        run= true;
        current_bus_stop= "school";
        next_bus_stop= "abc Market";
    }

    protected int add_person(){
        return this.current_people+= 1;
    }

    protected void chage_speed(int n){
        if (this.oil_percent < 10){
            System.out.print("주유량을 확인해 주세요.\n");
            return;
        }
        this.speed+= n;

    }

    public static void main(String[] args) {
        Bus bus= new Bus();
//        good way
        int people= bus.current_people;

//        bad way
        boolean lack_of_oil= bus.oil_percent == 0;
        boolean close_runing= bus.current_bus_stop == "차고지행";;

        if (lack_of_oil || close_runing)
            bus.run= false;
        if (bus.oil_percent < 10){
            System.out.println("주유가 필요하다’");
        }

        people= bus.add_person();

        if (people > bus.max_people) {
            people= 30;
        }

        bus.chage_speed(50);

    }
}

class RandomGenerator{
    protected static double number_init(){
        double random= 0.0;

        return random;
    }
    protected static String char_init(){
        String random= "";

        return random;
    }
}