package SectionAdvanceOOP.Ex04;
/*
*
* Exercicios sobre Classe Abstrata e interface
* */
public class Main {
    public static void main(String[] args){
        FuncionarioIntegral fti = new FuncionarioIntegral("Lucas", 8000);
        FuncionariaMeioPeriodo fmp = new FuncionariaMeioPeriodo("Maria", 22, 92);
        fti.adicionarBeneficio("Plano de saude, VA, VT, GYMPASS");
        fmp.adicionarBeneficio("VA e GYMPASS");

        fti.exibirFuncionario();
        System.out.println("Salario R$: " + fti.calcularSalario());
        fmp.exibirFuncionario();
        System.out.println("Salario R$: " + fmp.calcularSalario());
    }
}
