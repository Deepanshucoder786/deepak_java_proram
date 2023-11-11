import java.util.Scanner;
public class SumOfStreamInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int sum=0;
    //     while (n!=-1)
    //     {
    //         sum+=n;
    //         n=sc.nextInt();
    //     }
    //     System.out.println(sum);
    // }
    do{
        
        sum=sum+n;
    
        n= sc.nextInt();
    }while(n!=-1);
    System.out.println(sum);
    }
}
