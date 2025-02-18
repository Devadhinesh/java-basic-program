import java.util.Scanner;
public class sumdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int number=sc.nextInt();
        int sum=0;
        while(number!=0){
            int x=number%10;
            sum+=x;
            number=number/10;
        }
        System.out.println("The sum digits resulte is: "+sum);
    }
}
