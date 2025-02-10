import java.util.Scanner;
public class SumfirstNnatural {
    void demo(int number){
        int sum=0;
        for(int i=1;i<=number;i++){
            sum+=i;
        }
        System.out.println("The sum of first "+number+" value is:"+sum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        SumfirstNnatural obj=new SumfirstNnatural();
        System.out.println("Enter any number");
        int a=sc.nextInt();
        obj.demo(a);
    }
}
