import java.util.Scanner;
public class Leapyear {
    void demo(int year){
        if((year%4==0 && year%100!=0)|| (year%400==0)){
            System.out.println("Is a leap year");
        }else{
            System.out.println("Is not a leap year");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Leapyear obj=new Leapyear();
        System.out.println("Enter any year:");
        int x=sc.nextInt();
        obj.demo(x);
    } 
}