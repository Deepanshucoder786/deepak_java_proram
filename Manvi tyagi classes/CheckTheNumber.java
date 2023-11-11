import java.util.Scanner;
public class CheckTheNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Etner the number");
        int num= sc.nextInt();
        if(num>0)
        System.out.println("number is positive" +num );
        else if(num<0)
        System.out.println("number is negative" +num);
        else if(num==0)
        System.out.println("number is equal to zero" +num);
    }
    
}
