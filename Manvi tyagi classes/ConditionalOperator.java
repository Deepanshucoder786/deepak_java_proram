import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int value=sc.nextInt();
        if(value%2==0 && value%3==0)
        {
            System.out.println("number is even and divisible by 3" );
        }
        else{
            System.out.println("number is odd" );
        }
    }
    
}
