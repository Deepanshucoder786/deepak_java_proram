import java.util.Scanner;

public class ArrayQuestion {
    static int lastOccurrence(int[] arr, int x){
        int lastindex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lastindex=i;

            }
        }
        return lastindex;
    }
    static int Occurrence(int[] arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
             
        }
         return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the element :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter x:");
        int x=sc.nextInt();
       //System.out.println( " count x"+Occurrence(arr, x));
        System.out.println("last index " + lastOccurrence(arr, x));
    }
    
}
