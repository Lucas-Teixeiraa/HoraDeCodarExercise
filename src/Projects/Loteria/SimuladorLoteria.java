package Projects.Loteria;

import java.util.Scanner;

public class SimuladorLoteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] aposta = new int[6];
        int continuaJogo = 1;

        while (continuaJogo != 0) {
            System.out.println("Digite os 6 números da sua aposta (de 1 a 60):");
            for (int i = 0; i < aposta.length; i++) {
                int numero;
                boolean numeroValido;
                do {
                    numero = sc.nextInt();
                    numeroValido = numero >= 1 && numero <= 60;
                    if (!numeroValido) {
                        System.out.println("Número inválido. Digite um número entre 1 e 60:");
                    }
                } while (!numeroValido);
                aposta[i] = numero;
            }

            Bilhete bilhete = new Bilhete(aposta, aposta);
            int[] resultadoSorteio = bilhete.realizarSorteio();

            System.out.println("Números sorteados:");
            for (int numero : resultadoSorteio) {
                System.out.print(numero + " ");
            }
            System.out.println();

            System.out.println("Deseja continuar jogando? (1 - sim, 0 - não)");
            continuaJogo = sc.nextInt();
        }

        sc.close();
    }
}
