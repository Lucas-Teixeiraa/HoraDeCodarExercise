package SectionsLoops;

import java.util.Scanner;
/*
 * Exercicios do curso Hora de Codar!
 * Aula de Loops
 * */
public class LoopsJava {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //System.out.println(SumNumberInLoop());
        //SumParNumbersLoop();
        //int entrada = sc.nextInt();
        /*if(isPrimeNumber(entrada)){
            System.out.println("EH PRIMO!");
        }else{System.out.println("nao eh primo!");}*/

        //randomMenu();

        //System.out.println("O numero fatorado eh: "+factorialWithFor(entrada));
        countNumber();


    }

    public static int SumNumberInLoop(){
        int i, sum = 0;
        int[] arry = new int[100];
        for(i = 0; i <= arry.length;i++){
            sum += i;
        }
        return sum;
    }

    public static void SumParNumbersLoop(){
        int number = 0;
        while(number >= 0 && number <= 20){
            if(number % 2 == 0){
                System.out.println(number);
            }
            number++;
        }
    }

    public static boolean isPrimeNumber(int number){
        boolean isPrime = true;
        for(int i = 2; i<number;i++){
            if(number % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void randomMenu(){
        int key;

        do{
            key = (int)(Math.random() * 5);
            System.out.println("0) Valorant");
            System.out.println("1) R6");
            System.out.println("2) COD BO6");
            System.out.println("3) CSGO2");
            System.out.println("4) Sair");

            System.out.println("Opcao escolhida: "+ key);
        }while (key != 4);
    }

    public static int factorialWithFor(int number){
        int i, sum = 1;
        for(i = 1; i<=number;i++){
            sum *= i;
        }
        return sum;
    }

    public static void countNumber(){
        int numberToCount = 100000;
        int counter = 0;

        while (numberToCount!=0){
            numberToCount = numberToCount /10;
            System.out.println(numberToCount);
            counter++;
        }
        System.out.println("Number of digits: "+counter);
    }
}
