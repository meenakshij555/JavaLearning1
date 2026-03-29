package packOne;

public class TypeCasting {
    public static void main(String[] args) {
        //widening implicit
        double a=24;
        System.out.println(a);
        //widening explicit
        double b=(double)8;
        System.out.println(b);
        //narrowing explicit
        int c=(int)8.01;
        System.out.println(c);
    }
}
