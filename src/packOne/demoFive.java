package packOne;

public abstract class demoFive {
    abstract void display();
    abstract void test();
    void cool(){
        System.out.println("this is cool");
    }
}
abstract class testerOne extends demoFive{
    void display(){
        System.out.println("this is display");
    }

}
class testerTwo extends testerOne{
    void test(){
        System.out.println("this is Test");
    }
}
class mainClassFive{
    public static void main(String[] args) {
        testerTwo t=new testerTwo();
        t.display();
        t.test();
        t.cool();
    }
}