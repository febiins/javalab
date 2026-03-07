package exam;
import java.util.*;

class Matrix {

    int row, col;
    int[][] m, m2, res;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Enter rows and columns of matrix");
        row = sc.nextInt();
        col = sc.nextInt();

        m = new int[row][col];
        m2 = new int[row][col];
    }

    public int[][] readMatrix() {
        int[][] temp = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                temp[i][j] = sc.nextInt();
            }
        }
        return temp;
    }

    public void read() {

        System.out.println("Enter elements of first matrix");
        m = readMatrix();

        System.out.println("Enter elements of second matrix");
        m2 = readMatrix();
    }

    public Matrix mul(){

        Matrix obj = new Matrix();
        obj.row = row;
        obj.col = col;
        obj.res = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                obj.res[i][j] = 0;

                for (int k = 0; k < col; k++) {
                    obj.res[i][j] += m[i][k] * m2[k][j];
                }
            }
        }

        return obj;
    }

    public void disp(int[][] mat){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}

public class MatrixOOPS {

    public static void main(String[] args) {
        try {
            Matrix obj = new Matrix();

            obj.input();
            obj.read();

            Matrix result = obj.mul();

            System.out.println("First Matrix:");
            obj.disp(obj.m);

            System.out.println("Second Matrix:");
            obj.disp(obj.m2);

            System.out.println("Result Matrix:");
            result.disp(result.res);
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
      
    }
}