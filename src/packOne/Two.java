package packOne;

public class Two {
    static int a=1;
    static int b=2;
    public static void main(String[] args) {
        //static and non static
        Two t=new Two();
        System.out.println(a);
        System.out.println(t.b);
        sum();
        t.sub();
    }
    static void sum(){
        int c=a+b;
        System.out.println("sum of a and b="+c);

    }
    void sub(){
        int d=a-b;
        System.out.println("sub of a and b="+d);
    }
}
