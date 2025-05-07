package SectionAdvanceOOP.Ex04;

public class FuncionariaMeioPeriodo extends Funcionario implements Beneficios{
    private double salarioHora;
    private int horasTrabalhadas;

    public FuncionariaMeioPeriodo(String nome, double salarioHora, int horasTrabalhadas){
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioHora = salarioHora;
    }

    @Override
    public double calcularSalario(){
        return salarioHora * horasTrabalhadas;
    }

    @Override
    public void adicionarBeneficio(String beneficios){
        System.out.println("Beneficios adicionados para funcionario meio periodo: "+ beneficios);
    }
}
