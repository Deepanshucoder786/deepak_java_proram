import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        int year= sc.nextInt();
        if(year%400==0 || year%100==0 || year%4==0)
        System.out.println("yera is leap year" +year);
        else
        System.out.println("yera is not leap year");
    }
    
}
