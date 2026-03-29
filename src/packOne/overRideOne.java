package packOne;

public class overRideOne {
    void whatsApp(){
        System.out.println("my whatsapp version is 1.0");
    }
}
class overRideTwo extends overRideOne{
    void whatsApp(){
        System.out.println("my whatsapp version is 2.0");
    }
}
class mainClassTwo{
public static void main(String[] args) {
    overRideTwo ot=new overRideTwo();
    ot.whatsApp();
}
}