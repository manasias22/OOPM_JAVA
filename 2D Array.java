//2D Array

CODE:

import java.util.*;

class TwoD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int r;
        int c;

        int A[][] = new int[20][20];
        int B[][] = new int[20][20];
        int R[][] = new int[20][20];

        System.out.println("Enter the number of rows and columns: ");
        r = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Enter the matrix A: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                A[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the matrix B: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                B[i][j]=sc.nextInt();
            }
        }

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                R[i][j]=A[i][j] + B[i][j];
            }
        }

        System.out.println("Addition of matrix A and matrix B: ");
        for(int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(R[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

OUTPUT:

Enter the number of rows and columns:
3 3
Enter the matrix A:
1 2 3
4 5 6
7 8 9
Enter the matrix B:
1 2 3
4 5 6
7 8 9
Addition of matrix A and matrix B:
2       4       6
8       10      12
14      16      18
