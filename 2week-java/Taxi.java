public class Taxi extends Car{
    int max_people;
    int per_distance;
    int bill;
    int distance;
    int total;

    Taxi(){
        distance= 0;
        per_distance= 1000;
        max_people= 4;
        bill= 3000;
        current_people= 0;
        car_number= ""
                + Car.RandomGenerator.number_init();
        oil= 100;
        speed= 60;
        run= true;
        current_bus_stop= "school";
        next_bus_stop= "abc Market";
        total= 0;
    }

    @Override
    protected void add_person(int n) {
        int people = current_people + n;
        if (this.max_people < people) {
            System.out.println("최대 승객 수 초과");
            this.current_people = this.current_people;
        } else {
            this.current_people += n;
        }
    }

    protected void oilOut(){
        System.out.println("주유 필요");
        this.run= false;
    }
    protected void setDistance(int distance){
        this.distance= distance;
    }

    protected void showBills(){
        int result= (((this.distance-1) * this.per_distance) + this.bill);
        this.total+= result;
        System.out.println(result);
        checkOut();
    }

    protected void showRemainedPeople(){
        System.out.println(this.max_people-this.current_people);
    }

    protected void checkOut(){
        this.distance= 0;
        this.current_people= 0;
        this.next_bus_stop= "none";
        this.oil+= 20;
    }

    public static void main(String[] args) {
//        각 Taxi 번호 다른지 확인
        Taxi t1= new Taxi();
        Taxi t2= new Taxi();
        System.out.println(t1.car_number);
        System.out.println(t2.car_number);
        System.out.println(t1.oil);
        System.out.println(t1.run);

        System.out.println("===승객 +2===");
        t1.add_person(2);
        t1.setCurrentBusStop("강남역");
        t1.setNextBusStop("서울역");
        t1.setDistance(2);

        System.out.println(t1.current_people);
        t1.showRemainedPeople();
        t1.changeOil(-80);
        t1.showBills();

//        최대 승객
        t1.add_person(5);

        t1.add_person(3);
        t1.setDistance(12);

        t1.changeOil(-20);
        t1.showBills();
        if (t1.oil <= 0){
            t1.oilOut();
        }

        System.out.println(t1.total);
    }
}
