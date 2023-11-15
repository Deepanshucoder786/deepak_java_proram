import java.util.Scanner;

public class SortOfArray {
    static void swap(int[] arr ,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    // static void SortzeroAndOne(int[] arr){
    //     int n=arr.length;
    //     int zeroes=0;
    //     for(int i=0; i<n ;i++){
    //         if(arr[i]==0){
    //             zeroes++;
    //         }
    //     }
    //     for(int i=0; i<n ;i++){
    //         if(i<zeroes){
    //             arr[i]=0;
    //         }
    //         else{
    //             arr[i]=1;
    //         }
    //     }

    // }
   static void SortzeroAndOne(int[] arr){
    int n=arr.length;
    int left=0; 
    int right=n-1;
    
    while(left<right){
        if(arr[left]==1 && arr[right]==0){
            swap(arr, right, left);
            left++;
            right--;
        }
        if(arr[left]==0){
            left++;
        }
        if(arr[right]==1){
            right--;
        }
        printArray(arr);
    }
   }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter then size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n+" element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("orginal array: ");
        
        printArray(arr);
        
        System.out.println(" sorted array: ");
        printArray(arr);
        SortzeroAndOne(arr);
        
        
    }
    
}
