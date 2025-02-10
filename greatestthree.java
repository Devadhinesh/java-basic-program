import java.util.Scanner;
public class greatestthree {
    void demo(int number1,int number2,int number3){
        if((number1>number2) && (number1>number3)){
            System.out.println("The number1 is greater");
        }else if((number2>number1) && (number2>number3)){
            System.out.println("The number2 is greater");
        }else{
            System.out.println("The number3 is greater");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        greatestthree obj=new greatestthree();
        System.out.println("Enter any 3 numbers:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        obj.demo(x, y, z);
    }
}
