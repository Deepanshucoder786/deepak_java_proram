import java.util.Scanner;

public class palindrom {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("mter the number");
    int num = sc.nextInt();
   int num3=num;
   int s=0;
    while(num!=0){
        int r=num%10;
          s=s*10+r;
          num=num/10;

    }
    if(num3==s)
    System.out.println("number is palindrom");
    else
    System.out.println("number is not palindrom");
}
    
    
}
