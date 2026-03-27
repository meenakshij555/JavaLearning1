package packOne;

public class Overload {
    public static void main(String[] args) {
       // Overload o=new Overload();
       // o.add(1);
        add(1);
        add("meena");
    }
    static void add(int a)
    {
        System.out.println(a);
    }
   static void add(String b)
    {
        System.out.println(b);
    }
    void add(char c)
    {
        System.out.println(c);
    }
}
