import java.util.Scanner;
public class PrintNumberWithforLoop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int sum=0;
        // for(int num=1;num<=n;num++)
        // {
        //     // System.out.println(num); //print n natural number
        //     sum=sum+num; //print sum os n natural number
        // }
        // System.out.println("Sum of number" + sum);
         for(int num=n ;num>=1;num--)
        {
            System.out.println(num);
        }
        
    }
    
}
