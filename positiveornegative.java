import java.util.Scanner;
public class positiveornegative {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int number=sc.nextInt();
        if(number>0){
            System.out.println("Positive number");
        }else if(number==0){
            System.out.println("Zero number");
        }else{
            System.out.println("Negative number");
        }
    }
}
