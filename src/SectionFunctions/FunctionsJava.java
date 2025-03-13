package SectionFunctions;

import java.util.Scanner;
public class FunctionsJava {
    public static void main(String[] args) {
        /*System.out.println("Hello, World!");
        int[] array = {1, 4, 5, 6, 2, 3, 10};
        System.out.println(ConvertTemperature(39.2));
        System.out.println(FactorialNumber(10));
        isParOrImpar(14);
        ClassificationTestScore(101);
        AgeConfirm(19);
        System.out.println(BiggerNumberInArray(array));*/
        Scanner sc = new Scanner(System.in);
        System.out.println("O que voce deseja fazer?");
        System.out.println("1 - Converter Celsius para Fahrenheit");
        System.out.println("2 - Converter Fahrenheit para Celsius");
        int opcao = sc.nextInt();
        double valorConversor = sc.nextDouble();
        switch (opcao){
            case 1:
                System.out.println(valorConversor + " convertido de Celsius para: " +
                        String.format("%.2f", ConvertTemperatureToFahrenheit(valorConversor)) + " em Fahrenheit");
                break;
            case 2:
                System.out.println(valorConversor + " convertido de Fahrenheit para: " +
                        String.format("%.2f", ConvertTemperatureToCelsius(valorConversor)) + " em Celsius");
                break;
            default:
                System.out.println("Opcao Invalida!");
        }
        sc.close();
    }

    public static double ConvertTemperatureToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static double ConvertTemperatureToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * (5.0/9.0);
    }

    public static int FactorialNumber(int n) {
        int i;
        int factResult = 1;
        for (i = 1; i <= n; i++) {
            factResult = factResult * i;
        }
        return factResult;
    }

    public static void isParOrImpar(int number) {
        if (number % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }

    public static void ClassificationTestScore(int number) {
        int testScoreOption = 0;
        if (number >= 80 && number <= 100) {
            testScoreOption = 1;
        } else if (number >= 70 && number < 85) {
            testScoreOption = 2;
        } else if (number >= 60 && number < 75) {
            testScoreOption = 3;
        } else if (number >= 40 && number < 65 ) {
            testScoreOption = 4;
        } else if (number >= 0 && number <= 35){
            testScoreOption = 5;
        }

        switch (testScoreOption) {
            case 1:
                System.out.println("Sua nota no teste eh A!");
                break;
            case 2:
                System.out.println("Sua nota no teste eh B!");
                break;
            case 3:
                System.out.println("Sua nota no teste eh C!");
                break;
            case 4:
                System.out.println("Sua nota no teste eh D!");
                break;
            case 5:
                System.out.println("Sua nota no teste eh F!");
                break;
            default:
                System.out.println("Nota Invalida!");
                break;
        }
    }

    public static void AgeConfirm(int age){
        if (age < 18){
            System.out.println("Acesso Negado!");
            System.exit(0);
        }
        System.out.println("Acesso Permitido!");
    }

    public static int BiggerNumberInArray(int[] arr){
        int biggerNumber = 1;
        for(int i = 0; i < arr.length;i++){
            if(arr[i]>biggerNumber){
                biggerNumber = arr[i];
            }
        }
        return biggerNumber;
    }

    //Fibonacci Interativo
    public static int[] gerarFibonacci(int number){
        if(number == 0){
            return new int[0];
        }

        int[] fibbo  = new int[number];
        fibbo[0] = 0;

        if(number > 1){
            fibbo[1]=1;
        }

        for(int i = 2; i<number;i++){
            fibbo[i] = fibbo[i-1]+fibbo[i-2];
        }
        return fibbo;
    }
}
