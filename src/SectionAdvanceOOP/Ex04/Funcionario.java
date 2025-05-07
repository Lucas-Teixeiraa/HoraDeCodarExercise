package SectionAdvanceOOP.Ex04;

abstract class Funcionario {
    protected String nome;

    public Funcionario(String nome){
        this.nome = nome;
    }

    public abstract double calcularSalario();

    public void exibirFuncionario(){
        System.out.println("Funcionario: "+nome);
    }
}
