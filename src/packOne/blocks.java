package packOne;

public class blocks {
    static {
        System.out.println("This is a static block");

    }
    {
        System.out.println("This is a non-static block");

    }
    public static void main(String[] args) {
        blocks b=new blocks();
        System.out.println("main method started");
        System.out.println("main method ended");

    }
}
