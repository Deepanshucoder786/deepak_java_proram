public class ChangeArrayMethod {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
       System.out.println();

   }
    static void changeArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
    }
    static void changeValue(int a){
        a=1000;
    }
    public static void main(String[] args) {
        int a=5;
        System.out.println(a);
        changeValue(a);
        int[] arr=new int[4];
        arr[0]=5;
        arr[1]=4;
        arr[2]=6;
        arr[3]=9;
        changeArray(arr);
        printArray(arr);
    }
    
}
