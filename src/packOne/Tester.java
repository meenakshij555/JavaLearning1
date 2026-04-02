package packOne;

public abstract class Tester {
    abstract void display();
}
class Sample extends Tester{
    void display(){
        System.out.println("this is a abstract class");
    }
}

