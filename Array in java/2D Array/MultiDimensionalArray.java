import java.util.Scanner;

public class MultiDimensionalArray {
    static void matixMultiplication(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("multiple is not possible: ");
            return;
        }
        int[][] ans = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    ans[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("multiplaction of two matrix");
        printArray(ans);
        
    }
    static void printArray(int [][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first matix size:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("enter" + r1 * c1 + "element");
        int[][] a = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter second matix size:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        System.out.println("enter" + r1 * c1 + "element");
        int[][] b = new int[r1][c1];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("first matix : ");
        printArray(a);
        System.out.println("second matrix :");
        printArray(b);
        System.out.println("multiplied matix: ");
        matixMultiplication(a, r1, c1, b, r2, c2);
    }
}