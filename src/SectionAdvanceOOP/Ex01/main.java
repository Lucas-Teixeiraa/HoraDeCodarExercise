package SectionAdvanceOOP.Ex01;

public class main {
    public static void main(String[] args){
        Endereco endereco = new Endereco("Test rua", 123, "Contagem");
        Pessoa pessoa = new Pessoa("Jonas", 42, endereco);
        pessoa.exibirInformacoes();
    }
}
