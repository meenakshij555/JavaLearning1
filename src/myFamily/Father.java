package myFamily;

public class Father {
    private void atm(){
        System.out.println("Access ATM");
    }
    void car(){
        System.out.println("Access car");
    }
    protected void bike(){
        System.out.println("Access bike");
    }
    public void cycle(){
        System.out.println("Access cycle");
    }
}
class son{
   public static void main(String[] args) {
        Father f=new Father();
        f.cycle();
        f.car();
        f.bike();
    }
}