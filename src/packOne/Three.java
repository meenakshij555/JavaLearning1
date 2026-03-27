package packOne;

public class Three {
    //constructor emp name emp id and emp experience
    String empName;
    int empId;
    int empExp;
    Three(String empName,int empId,int empExp)
    {
        this.empName=empName;
        this.empId=empId;
        this.empExp=empExp;
    }
    public static void main(String[] args) {
        Three t=new Three("ammu",1,5);
        System.out.println(t.empName);
        System.out.println(t.empId);
        System.out.println(t.empExp);
    }
}
