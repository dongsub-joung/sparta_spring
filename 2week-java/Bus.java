public class Bus extends Car{
    int max_people;
    int bill;

    Bus(){
        current_people= 0;
        max_people= 30;
        bill= 1000;
        car_number= ""
                + RandomGenerator.number_init();
        oil= 100;
        speed= 0;
        run= false;
        current_bus_stop= "school";
        next_bus_stop= "abc Market";
    }

    protected int showRemains(){
        return this.max_people - this.current_people;
    }

    protected int checkBills(){
        return this.current_people * this.bill;
    }

    @Override
    protected void changeOil(int n){
        this.oil+= n;
        if (this.oil < 10){
            this.current_bus_stop="차고지행";
            this.run= false;
            System.out.println("주유가 필요하다’");
        }
    }

    protected void returnCarcenter(){
        this.current_bus_stop= "차고지행";
        this.current_people= 0;
        this.changeOil(10);
        this.run= false;
    }

    @Override
    protected void add_person(int n){
        int people= current_people+ n;
        if (this.max_people < people){
            System.out.println("최대 승객 수 초과");
            this.current_people= this.current_people;
        } else {
            this.current_people+= n;
        }
    }

    public static void main(String[] args) {
//        각 Bus 번호 다른지 확인
        Bus bus= new Bus();
        Bus bus2= new Bus();
        System.out.println(bus.car_number);
        System.out.println(bus2.car_number);

//        승객 +2
        bus.add_person(1);
        bus.add_person(1);
        System.out.println(bus.current_people);
        System.out.println(bus.showRemains());
        System.out.println(bus.checkBills());

//      주유량 -50
        bus.changeOil(-50);
        System.out.println(bus.oil);

//        차고지행
        bus.returnCarcenter();
        System.out.println(bus.current_bus_stop);
        System.out.println(bus.oil);
        System.out.println(bus.run);

        bus.turnOn();
        System.out.println(bus.run);

        bus.add_person(45);
        bus.add_person(5);

        System.out.println(bus.current_people);
        System.out.println(bus.showRemains());
        System.out.println(bus.checkBills());

//        주유량 -55
        bus.changeOil(-55);

        System.out.println(bus.oil);
    }
}