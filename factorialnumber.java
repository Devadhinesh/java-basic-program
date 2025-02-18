import java.util.Scanner;
public class factorialnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any numer");
        int number=sc.nextInt();
        long result=1;
        for(int i=number;i>0;i--){
            result*=i;
        }
        System.out.println(number+" factorial number is:"+result);
    }
}

