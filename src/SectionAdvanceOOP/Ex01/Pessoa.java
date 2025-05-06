package SectionAdvanceOOP.Ex01;

public class Pessoa {
    private String nome;
    private int idade;
    private Endereco composicaoEndereco;

    public Pessoa(String nome, int idade, Endereco composicaoEndereco){
        this.nome = nome;
        this.idade = idade;
        this.composicaoEndereco = composicaoEndereco;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: "+nome+"Idade: " +idade+"\nEndereco: "+ composicaoEndereco.exibirEndereco());
    }
}
