import java.util.Scanner;
public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num_1=sc.nextInt();
        System.out.println("Enter the second number");
        int num_2=sc.nextInt();
        int sum=num_1+num_2;
        System.out.println("The sum of two number" + sum);
    }
    
}
