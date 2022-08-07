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
        oil= 100;
        speed= 60;
        run= false;
        current_bus_stop= "school";
        next_bus_stop= "abc Market";
    }

    protected void add_person(int n){
        this.current_people+= n;
    }

    protected void changeOil(int n){
        this.oil+= n;
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
    protected void setCurrentBusStop(String bus_stop){
        this.current_bus_stop= bus_stop;
    }
    protected void setNextBusStop(String bus_stop){
        this.current_bus_stop= bus_stop;
    }
    class RandomGenerator{
        protected static int  number_init(){
            int random= (int)(Math.random() * 10000);
            return random;
        }
    }
}


