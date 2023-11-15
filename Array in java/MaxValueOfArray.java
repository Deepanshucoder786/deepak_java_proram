class maximum{

    void searchInArray(){
        int[] a={1,2,3,4,5,6,7};
        int x=2;
        int ans=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==x){
                ans=i;
            }
        }
        System.out.println("found " +x+"at index "+ ans);

    }
    void maxvalue(){
        int [] arr={5,3,4,6,7,9};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        System.out.println("max value" + ans);
    }
}


public class MaxValueOfArray {
    public static void main(String[] args) {
        maximum obj=new maximum();
        obj.maxvalue();
        obj.searchInArray();
        
    }
    
}
