import java.util.Scanner;
public class Sumofrange {
    void demo(int number1,int number2){
        int sum=0;
        for(int i=number1;i<=number2;i++){
            sum+=i;
        }
        System.out.println("The sum is:"+sum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Sumofrange obj=new Sumofrange();
        System.out.println("Enter two values:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        obj.demo(x,y);
    }
}