import java.util.Scanner;

public class CountNumberOfDigites {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int sumofdigites=0;
        int orignal_n=num;
        while(num>0){
            
            sumofdigites=sumofdigites+num%10;
            num=num/10;
            
        }
        System.out.println("number of digites" +orignal_n+"="+sumofdigites);
    }
    
}
