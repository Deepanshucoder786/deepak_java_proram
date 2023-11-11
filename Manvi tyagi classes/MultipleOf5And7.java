import java.util.Scanner;

public class MultipleOf5And7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int num=1;
        //multiple of 5 and 7 with the help of for loop
        // for(int num=1;num<=n;num++)
        // {  if(num%5==0 &&num%7==0){
        //     System.out.println("multiple is" + num);
        //     break;

        // }
            
        // }
        while(true)
        {
            if(num%5==0 && num%7==0)
            
            break;
        }
        System.out.println("ans is" + num);
        num++;
        
    }
}
        
    
    

