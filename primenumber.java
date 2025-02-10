import java.util.Scanner;
public class primenumber {
    void demo(int number) {
        if (number<2) {
            System.out.println("Is not a prime number");
            return;
        }
        for (int i=2;i<=(number/2);i++){
            if (number%i==0) {
                System.out.println("Is not a prime number");
                return;
            }
        }
        System.out.println("Is a prime number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        primenumber obj = new primenumber(); 
        System.out.println("Enter any number:");
        int x = sc.nextInt();
        obj.demo(x);
        sc.close();
    }
}
