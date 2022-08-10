class Car {
    int current_people;
    int max_people;
    String car_number;
    int oil;
    int speed;
    boolean run;
    String current_spot;
    String next_spot;

    Car(){
        current_people= 0;
        max_people= 0;
        car_number= ""
                + RandomGenerator.number_init();
        oil= 100;
        speed= 40;
        run= false;
        current_spot= "base";
        next_spot= "abc Market";
    }

    protected void add_person(int n){
        if (n+current_people > max_people)
            System.out.println("Denied");
        else
            this.current_people+= n;
    }
    protected void changeOil(int n){
        int oil= this.oil;

        this.oil+= n;

        if (oil < 10)
            System.out.println("need oil");
        else if(oil <= 0){
            this.turnOff();
            System.out.println("CAN'T");
        }
    }

    protected void turnOff(){ this.run= false; }
    protected void turnOn(){
        this.run= true;
    }
    protected void setCurrentSpot(String spot){
        this.current_spot= spot;
    }
    protected void setNextSpot(String spot){
        this.next_spot= spot;
    }
    class RandomGenerator{
        protected static int  number_init(){
            int random= (int)(Math.random() * 10000);
            return random;
        }
    }
}


