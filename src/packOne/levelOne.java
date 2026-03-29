package packOne;

public class levelOne {
    int a=1;
}
class levelTwo extends levelOne{
    int b=2;
}
class levelThree extends levelTwo{
    public static void main(String[] args) {
      levelThree l=new levelThree();
      System.out.println(l.a);
      System.out.println(l.b);
    }
}

