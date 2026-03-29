package packOne;

public class hieOne {
    String s="parents";
}
class hieTwo extends hieOne{
    String c="chinna";
}
class hieThree extends hieOne{
    String r="Rose";
}
class mainClass{
    public static void main(String[] args) {
        hieTwo h=new hieTwo();
        System.out.println(h.s);
        System.out.println(h.c);
        hieThree ht=new hieThree();
        System.out.println(ht.s);
        System.out.println(ht.r);
    }

}
