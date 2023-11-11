import java.util.Scanner;

public class MaxTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1= sc.nextInt();
        System.out.println("ENTER THE SECOND NUMBER");
        int num2= sc.nextInt();
        if(num1>num2)
        System.out.println("Maximum number" +num1);
        else if(num1<num2)
        System.out.println("maximum number" +num2);
        else
        System.out.println("both re equal" +num1);
    
}
    
}
