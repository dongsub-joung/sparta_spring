public class test {
    int a= 1;
    test(){
        a= 2;
    }

    protected void chage_Value(){
        this.a= 10;
    }

    public static void main(String[] args) {
        test t= new test();
        t.a= 3;
        System.out.println(t.a);
        t.chage_Value();
        System.out.println(t.a);
    }
}
