package Projects;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo a calculador!");
        System.out.println("-----------------------");
        System.out.println("Escolha qual operacao abaixo:");
        System.out.println("1) Somar");
        System.out.println("2) Subtrair");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");
        System.out.println("5) Sair");
        int opcao;
        opcao = sc.nextInt();

        while(opcao != 5){
            if(opcao <= 0 || opcao > 5){
                System.out.println("|------------------------------|");
                System.out.println("Opcao Invalida, tente novamente.");
                System.out.println("|------------------------------|");

            }else{
                System.out.println("Agora digite o primeiro valor: ");
                double inputOne = sc.nextDouble();
                System.out.println("Agora digite o segundo valor: ");
                double inputTwo = sc.nextDouble();

                if(opcao == 1) System.out.println("O valor da soma eh: "+SumNumber(inputOne, inputTwo));
                if(opcao == 2) System.out.println("O valor da subtracao eh: "+MinusNumber(inputOne, inputTwo));
                if(opcao == 3) System.out.println("O valor da multiplicacao eh: "+MultixNumber(inputOne, inputTwo));
                if(opcao == 4) System.out.println("O valor da divisao eh: "+DivisonNumber(inputOne, inputTwo));
            }
            System.out.println("Escolha qual operacao abaixo:");
            System.out.println("1) Somar");
            System.out.println("2) Subtrair");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("5) Sair");
            opcao = sc.nextInt();

        }
        sc.close();
    }

    public static double SumNumber(double numberOne, double numberTwo){
        return numberOne + numberTwo;
    }

    public static double MultixNumber(double numberOne, double numberTwo){
        return numberOne * numberTwo;
    }

    public static double MinusNumber(double numberOne, double numberTwo){
        return numberOne - numberTwo;
    }

    public static double DivisonNumber(double numberOne, double numberTwo){
        if(numberOne == 0 || numberTwo == 0){
            return 0;
        }
        return numberOne / numberTwo;
    }
}
