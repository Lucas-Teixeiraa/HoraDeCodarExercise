package SectionArrays;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int maxI, maxJ;
        System.out.println("Digite o valor da linha: ");
        maxI = sc.nextInt();
        System.out.println("Digite o valor da coluna: ");
        maxJ = sc.nextInt();
        int [][] matrix = new int[maxI][maxJ];
        int [][] matrixTransporta = new int[maxJ][maxI];
        for(int i = 0; i<matrix.length;i++){
            for (int j = 0; j<matrix[i].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<maxI;i++){
            for (int j = 0; j<maxJ;j++){
                matrixTransporta[j][i] = matrix[i][j];
            }
        }

        for(int j = 0; j<maxJ;j++){
                System.out.println(Arrays.toString(matrixTransporta[j]));
        }

    }
}
