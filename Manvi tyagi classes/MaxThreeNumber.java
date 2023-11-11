import java.util.Scanner;
public class MaxThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first numnber");
        int a= sc.nextInt();
        System.out.println("enter the second numnber");
        int b= sc.nextInt();
        System.out.println("enter the third numnber");
        int c= sc.nextInt();
        if(a>b && a>c)
        System.out.println("max number is " +a);
        else if(b>c && b>a)
        System.out.println("max number is" +b);
        else if(c>a && c>b)
        System.out.println("max number is " +c);
        else
        System.out.println("wrong number");

    }
    
}
