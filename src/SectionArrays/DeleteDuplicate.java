package SectionArrays;

import java.util.Arrays;
import java.util.Scanner;
/*
 * Exercicios do curso Hora de Codar!
 * Aula de Arrays
 * */
public class DeleteDuplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7,8,9,10,10,10,10,2,2,2,3,4,5,1,2,7,8};
        Arrays.sort(array);
        int[] tempArray = new int[array.length];
        int j = 0;
        for(int i = 0; i<array.length - 1;i++){
            if(array[i]!=array[i+1]){
                tempArray[j++] = array[i];
            }
        }
        tempArray[j++] = array[array.length - 1];
        int[] resultArray = Arrays.copyOf(tempArray,j);

        System.out.println(Arrays.toString(resultArray));

    }
}
