package Projects;

import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] secretWord = {"GERMANY"};
        char[] splitWord = secretWord[0].toUpperCase().toCharArray();
        char[] guestWord = new char[splitWord.length];
        int attempts = 0;
        int maxAttempts = splitWord.length + 3;
        boolean found;

        // Substitui o vetor por underlines.
        for (int i = 0; i < splitWord.length; i++) {
            guestWord[i] = '_';
        }

        // Vetor para armazenar as tentativas do usuário
        char[] attemptsWord = new char[maxAttempts];
        int attemptsCount = 0;

        System.out.println("--------------------------");
        System.out.println("ADIVINHE A PALAVRA ABAIXO: ");
        System.out.println("--------------------------");
        System.out.println(" ");

        // Rodando o jogo
        while (attempts < maxAttempts) {
            found = false;

            System.out.print("\nPalavra: ");
            for (char c : guestWord) {
                System.out.print(c + " ");
            }

            System.out.print("\nDigite uma letra para adivinhar: ");
            char guess = sc.next().toUpperCase().charAt(0);

            boolean alreadyTried = false;
            for (char attempted : attemptsWord) {
                if (attempted == guess) {
                    alreadyTried = true;
                    break;
                }
            }
            if (alreadyTried) {
                System.out.println("Você já tentou essa letra!");
                continue;
            }

            attemptsWord[attemptsCount++] = guess;

            for (int i = 0; i < splitWord.length; i++) {
                if (splitWord[i] == guess) {
                    guestWord[i] = guess;
                    found = true;
                }
            }

            if (!found) {
                attempts++;
                System.out.println("Letra incorreta! Tentativas restantes: " + (maxAttempts - attempts));
            }

            if (new String(guestWord).equals(new String(splitWord))) {
                System.out.println("\nParabéns! Você acertou a palavra: " + new String(splitWord));
                return;
            }
        }

        System.out.println("\nVocê perdeu! A palavra era: " + new String(splitWord));
    }
}
