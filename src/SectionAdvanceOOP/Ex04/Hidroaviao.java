package SectionAdvanceOOP.Ex04;

import SectionAdvanceOOP.Ex05.Barco;
import SectionAdvanceOOP.Ex05.Pilotavel;

public class Hidroaviao extends Barco implements Pilotavel {

    @Override
    public void pilotar(){
        System.out.println("O hidroaviao esta sendo pilotado e depois ira navegar!");
    }
}
