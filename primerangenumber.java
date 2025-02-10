import java.util.Scanner;
public class primerangenumber {
    void demo(int startnumber,int endnumber){
        System.out.println("Prime numbers in range "+startnumber+" and "+endnumber+" are:");
        while(startnumber<=endnumber){
            int temp=0;
            for(int i=2;i<=(startnumber/2);i++){
                if(startnumber%i==0){
                    temp=1;
                    break;
                }
            }
            if(temp==0){
                System.out.println(startnumber);
            }
            startnumber++;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        primerangenumber obj=new primerangenumber();
        System.out.println("Enter start and end values:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        obj.demo(x,y);
    }
}