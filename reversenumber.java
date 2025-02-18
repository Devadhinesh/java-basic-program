import java.util.Scanner;
public class reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int number=sc.nextInt();
        for(int i=number;i>=0;i--){
            System.out.println(i);
        }
    }
}
