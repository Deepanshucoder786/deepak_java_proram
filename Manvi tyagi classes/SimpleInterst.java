import java.util.Scanner;

public class SimpleInterst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principle");
        float price= sc.nextInt();
        System.out.println("enter the rate of interst");
        float rate= sc.nextInt();
        System.out.println("enter the time");
        float time = sc.nextInt();
        float SimpleInterst=(price*rate*time)/100;
        System.out.println("SIimple interst is ="+SimpleInterst);
    }
    
}
