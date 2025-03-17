package SectionArrays;

import java.util.Arrays;
import java.util.Scanner;

public class InvertArray_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int maxNumbers = sc.nextInt();
        int[] array = new int[maxNumbers];
        for (int i = 0; i<array.length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Array Original: "+Arrays.toString(array));

        int esquerda = 0;
        int direita = array.length - 1;

        while (esquerda < direita){
            int temp = 0;
            temp = array[esquerda];
            array[esquerda] = array[direita];
            array[direita] = temp;

            esquerda++;
            direita--;
        }
        System.out.println("Array Invertido: "+Arrays.toString(array));
    }
}
