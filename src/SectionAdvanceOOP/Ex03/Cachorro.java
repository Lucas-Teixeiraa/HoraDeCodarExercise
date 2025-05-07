package SectionAdvanceOOP.Ex03;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, String som, String raca){
        super(nome, som);
        this.raca = raca;
    }

    public void detalhes(){
        System.out.println("Nome: "+ nome +", Raca: "+raca);
        this.emitirSom();
    }
}
