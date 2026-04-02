package packOne;

public class Atm {
    private int atm_pin=12345;
    public int getAtm_pin() {
    return atm_pin;
    }
    public void setAtm_pin(int atm_pin){
    this.atm_pin=atm_pin;
    }
}
class mainClassThree {
    public static void main(String[] args) {
        Atm m=new Atm();
        System.out.println("original ATM Pin");
        System.out.println(m.getAtm_pin());
        m.setAtm_pin(56789);
        System.out.println(m.getAtm_pin());

    }
}
