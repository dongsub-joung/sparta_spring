class Car {
    int current_people;
    String car_number;
    int oil;
    int speed;
    boolean run;
    String current_bus_stop;
    String next_bus_stop;

    Car(){
        current_people= 0;
        car_number= ""
                + RandomGenerator.number_init();
        oil= 90;
        speed= 60;
        run= false;
        current_bus_stop= "school";
        next_bus_stop= "abc Market";
    }

    protected int add_person(){
        return this.current_people+= 1;
    }

    protected void change_speed(int n){
        if (this.oil < 10){
            System.out.print("주유량을 확인해 주세요.\n");
            return;
        }
        this.speed+= n;
    }

    protected void turnOn(){
        this.run= true;
    }
    class RandomGenerator{
        protected static double number_init(){
            double random= 0.0;

            return random;
        }
    }
}


