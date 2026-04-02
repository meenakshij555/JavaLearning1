package packOne;

public interface demoTwo {
    static final int a=10;
    public abstract void display();
}
class demoThree implements demoTwo{
    public void display(){
        System.out.println("this is display");
    }
}
class mainClassSix{
    public static void main(String[] args) {
        demoThree d=new demoThree();
        d.display();
        System.out.println(demoTwo.a);
    }
}

