package SectionAdvanceOOP.Ex05;

import SectionAdvanceOOP.Ex04.Hidroaviao;
/*
*
* Exercicio sobre implementacao de multiplas interfaces
* e Polimorfismo
*
* */
public class Main {
    public static void main(String[] args){
        Pilotavel hidroaviao = new Hidroaviao();
        Barco barco = new Barco();
        Pilotavel aviao = new Aviao();

        hidroaviao.pilotar();
        aviao.pilotar();
        barco.navegar();

        operarVeiculo(aviao);
        operarVeiculo(hidroaviao);
        operarVeiculo(barco);
    }

    public static void operarVeiculo(Object veiculo){
        if(veiculo instanceof Pilotavel){
            System.out.println("Veiculo e pilotavel");
        } else if (veiculo instanceof Navegavel) {
            System.out.println("Veiculo e navegavel");
        }
    }
}
