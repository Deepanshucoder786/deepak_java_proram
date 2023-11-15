public class SwapTwoInteger {
    static void swap(int a, int b){
        System.out.println("before swaping: ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        int temp=a;
        a=b;
        b=a;
        b=temp;
        System.out.println("after swaping");
        System.out.println("a: "+a);
        System.out.println("b: "+b);


    }
    static void swapwithouttemp(int a, int b){
        System.out.println("berore swaping");
         System.out.println("a: "+a);
        System.out.println("b: "+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swaping");
         System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
   

    
   
    public static void main(String[] args) {
        
        int a=9;
        int b=3;
        int[] arr={1,2,3,4,5};
        swap(a, b);
        swapwithouttemp(a, b);

       
        
    }
    
}
