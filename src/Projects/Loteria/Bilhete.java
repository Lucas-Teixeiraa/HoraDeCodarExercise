package Projects.Loteria;

import java.util.Arrays;

public class Bilhete {
    private int[] numerosEscolhidos;

    public int[] getResultadoSorteio() {
        return resultadoSorteio;
    }

    public void setResultadoSorteio(int[] resultadoSorteio) {
        this.resultadoSorteio = resultadoSorteio;
    }

    public int[] getNumerosEscolhidos() {
        return numerosEscolhidos;
    }

    public void setNumerosEscolhidos(int[] numerosEscolhidos) {
        this.numerosEscolhidos = numerosEscolhidos;
    }

    private int[] resultadoSorteio;

    public Bilhete(int[] numerosEscolhidos, int[] resultadoSorteio) {
        this.numerosEscolhidos = numerosEscolhidos;
        this.resultadoSorteio = resultadoSorteio;
    }

    public int[] realizarSorteio() {
        int[] numerosSorteados = new int[6];
        for (int i = 0; i < 6; i++) {
            numerosSorteados[i] = (int) (Math.random() * 60) + 1;
        }
        Arrays.sort(numerosSorteados);
        return numerosSorteados;
    }

    public int[] contarAcertos(){
        int[] acertos = new int[6];
        for (int i = 0; i < numerosEscolhidos.length; i++) {
            for (int j = 0; j < resultadoSorteio.length; j++) {
                if (numerosEscolhidos[i] == resultadoSorteio[j]) {
                    acertos[i] = numerosEscolhidos[i];
                }
            }
        }
        return acertos;
    }

    public void exibirResultado() {
        System.out.println("Números escolhidos: " + Arrays.toString(numerosEscolhidos));
        System.out.println("Resultado do sorteio: " + Arrays.toString(resultadoSorteio));
        int[] acertos = contarAcertos();
        System.out.println("Acertos: " + Arrays.toString(acertos));
    }
}
