import java.util.Scanner;
public class Evenodd {
   void demo(int number){
    if(number%2==0){
        System.out.println("Even number");
    }else{
        System.out.println("odd number");
    }
   }
   public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    Evenodd sc=new Evenodd();
    System.out.println("Enter any number:");
    int x=obj.nextInt();
    sc.demo(x);
   } 
}
