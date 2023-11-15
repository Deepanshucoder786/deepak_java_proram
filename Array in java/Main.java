class ArrayExample{
    void demoArray(){
         int[] age=new int[3];
        float[] weight=new float[3];
        String[] name=new String[3];
        age[0]=12;
        age[1]=3;
        age[2]=15;
        // age[5]=55;

        // weight[0]=12.2f;
        // weight[1]=22.2f;
        // weight[2]=32.2f;
        // System.out.println(age[0]);
        // System.out.println(age[1]);
        // System.out.println(age[2]);
        
       
    }
   

    void SumOfArray(){
        int[] arr={1,2,3,4};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);

    }
}

public class Main {
    public static void main(String[] args) {
        ArrayExample obj=new ArrayExample();
        // obj.demoArray();
        obj.SumOfArray();

        
    }

    
}
