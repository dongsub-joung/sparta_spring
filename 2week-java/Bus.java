public class Bus extends Car{
    int max_people;
    int bill;

    Bus(){
        current_people= 0;
        max_people= 30;
        bill= 500;
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

    protected void changeOil(int n){
        this.oil+= n;
    }

    protected void returnCarcenter(){
        this.current_bus_stop= "차고지행";
        this.changeOil(10);
        this.run= false;
    }

    public static void main(String[] ar차고지행gs) {
//        각 Bus 번호 다른지 확인
        Bus bus= new Bus();
        Bus bus2= new Bus();
        System.out.println(bus.car_number);
        System.out.println(bus2.car_number);

//        승객 +2
        bus.add_person();
        bus.add_person();
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

        if () {

        }

        boolean lack_of_oil= bus.oil == 0;
        boolean close_runing= bus.current_bus_stop == "차고지행";;

        if (lack_of_oil || close_runing)
            bus.run= false;
        if (bus.oil < 10){
            System.out.println("주유가 필요하다’");
        }

        people= bus.add_person();



        bus.change_speed(50);

    }
}