package packOne;

class classTypeCasting {
    void add(){
        System.out.println("add a number");
    }
}
class demoOne extends classTypeCasting{
    void sub(){
        System.out.println("sub a number");
    }
}
class Testing{
    public static void main(String[] args) {
        //upcasting implicit
        System.out.println("upcasting");
        classTypeCasting d=new demoOne();
        d.add();
        //downcasting explicit
        System.out.println("downcasting");
        demoOne l=(demoOne)d;
        l.add();
        l.sub();
    }
}