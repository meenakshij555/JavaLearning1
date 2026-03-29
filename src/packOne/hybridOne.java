package packOne;

public class hybridOne {
    int a=1;
}
class hybridTwo extends hybridOne{
    int b=2;
}
class hybridThree extends hybridTwo{
    void demo(){
        System.out.println("hi");
    }
}
class hybridFour extends hybridThree{
    String s="chinna";
}
class hybridFive extends hybridThree{
    String c="rose";
}
class mainClassOne{
    public static void main(String[] args) {
        hybridFour h=new hybridFour();
        System.out.println(h.a);
        System.out.println(h.b);
        h.demo();
        System.out.println(h.s);
        hybridFive hf=new hybridFive();
        System.out.println(hf.a);
        System.out.println(hf.b);
        h.demo();
        System.out.println(hf.c);
    }
}