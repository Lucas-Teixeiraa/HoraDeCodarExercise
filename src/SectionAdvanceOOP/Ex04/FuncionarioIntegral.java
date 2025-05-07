package SectionAdvanceOOP.Ex04;

public class FuncionarioIntegral extends Funcionario implements Beneficios{

    private double salarioBase;

    public FuncionarioIntegral(String nome, double salarioBase){
        super(nome);
        this.salarioBase = salarioBase;
    }


    @Override
    public double calcularSalario(){
        return salarioBase;
    }

    @Override
    public void adicionarBeneficio(String beneficios){
        System.out.println("Beneficios adicionados para funcionario Integral: "+ beneficios);
    }
}
