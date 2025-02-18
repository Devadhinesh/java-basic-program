import java.util.Scanner;
public class ArmstrongNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int number=sc.nextInt();
        int org_number=number;
        int count=0,res,sum=0;
        int temp=number;
        while(temp!=0){
            temp/=10;
            count+=1;
        }
        temp=number;
        while(temp!=0){
            res=temp%10;
            sum+=Math.pow(res,count);
            temp/=10;
        }
        if(org_number==sum){
            System.out.println(org_number+" Is an Armstrong number");
        }else{
            System.out.println(org_number+ " Is not an Armstrng number");
        }
    }
}