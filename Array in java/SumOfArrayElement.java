class sum{
      void SumOfArray(){
        int[] arr={1,2,3,4};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);

    }
}


public class SumOfArrayElement {
    public static void main(String[] args) {
        sum obj=new sum();
        obj.SumOfArray();
        
    }
    
}
