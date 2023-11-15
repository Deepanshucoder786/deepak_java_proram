import java.util.Scanner;

public class FindSecondMax {
    static int findmax(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static int findsecondmax(int[] arr){
        int mx=findmax(arr);
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax=findmax(arr);
        return secondMax;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter then size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         
        System.out.println("second max element " +findsecondmax(arr));
    }
    
}
