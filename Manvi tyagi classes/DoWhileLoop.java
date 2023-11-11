import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        int num=n;
        do{
            System.out.println(num);
            num--;
        }while(num>=1);

    }
    
}
