package SectionArrays;

import java.util.Scanner;

public class MostFrequentNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7,8,9,10,10,10,10,2,2,2,3,4,5,1,2,7,8};
        int maxCount = 0;
        int mostFrequentNumber = 0;
        for(int i = 0; i<array.length;i++){
            int count = 0;
            for(int j = 0; j<array.length;j++){
                if(array[j] == array[i]){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                mostFrequentNumber = array[i];
            }
        }


        System.out.printf("O numero mais encontrado: %d,\nnumero de vezes que foi encontrado: %d \n", mostFrequentNumber,maxCount);
    }
}
