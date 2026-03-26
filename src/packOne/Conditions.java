package packOne;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        //write a code for if only age is greater than 18
        Scanner s=new Scanner(System.in);
        System.out.println("enter your age");
        int a=s.nextInt();
        if(a>=18){
            System.out.println("enable for voting");
        }
        else{
            System.out.println("not enable for voting");
        }
    }
}
