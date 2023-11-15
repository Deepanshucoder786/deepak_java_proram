import java.util.Scanner;

public class SumOfQuriceInArray {
    static int[] prefixSumArray(int[] arr){
        int n=arr.length;
        // int[] pref=new int[n];
        // pref[0]=arr[0];
        
        for(int i=1; i<n; i++){
          arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("enter size of array: ");

        int n=sc.nextInt();
        int[] arr=new int[n+1];
        System.out.println("enter"+ n+"element");
        for(int i=1; i<=n; i++){
            arr[i]=sc.nextInt();
        }
        int[] prefSum=prefixSumArray(arr);
        System.out.println("enter number of quries: ");
        int q= sc.nextInt();
        while(q-->0){
            System.out.println("enter range");
            int l=sc.nextInt();
            int r=sc.nextInt();

            int ans= prefSum[r]-prefSum[l-1];
            System.out.println("sum"+ ans);
        }
    }
  
    
}
