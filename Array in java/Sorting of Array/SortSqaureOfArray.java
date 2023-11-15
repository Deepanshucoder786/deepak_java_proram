import java.util.Scanner;

public class SortSqaureOfArray {
    static void swap(int[] arr ,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int[] arr ){
        int i=0 , j=arr.length-1;
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    static int[]  sortSqureArray(int[] arr){
        int n=arr.length;
        int left=0, right=n-1;
        int[] ans= new int[n];
        int k=0;

        while(left<right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
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
       
        // SortzeroAndOne(arr);
        int[] ans=sortSqureArray(arr);
        reverse(ans);
         printArray(ans);
    }
    
}
