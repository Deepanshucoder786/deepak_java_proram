import java.util.Scanner;

public class TransposeMatrix {
    static int [][] findTransoseMatrix(int [][] matrix, int r, int c){
          int [][] ans= new int[r][c];
          for(int i=0; i<c; i++){
            for(int j=0 ;j<r; j++){
                 ans[i][j]=matrix[j][i];
            }
           
          }
          return ans;

    }
    static void transposeInPlace(int[][] matrix, int r, int c){
        for(int i=0; i<c; i++){
            for(int j=i; j<r; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]= temp;
            }
        }
    }
    static void printMatrix(int [][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
     }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("emter matrix size:");
        int r=sc.nextInt();
        int c= sc. nextInt();
        int[][] matrix = new int[r][c];
        int totalElement= r*c;
        System.out.println("enter " + totalElement+ " element");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
               matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("input matrix: ");
        printMatrix(matrix);
        System.out.println("transpose matrix: ");
        // int[][] ans= findTransoseMatrix(matrix, r, c);
        // printMatrix(ans);
        transposeInPlace(matrix, r, c);
        printMatrix(matrix);
    }
    
}
