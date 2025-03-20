package SectionPOO.Exercise02;

import java.util.Scanner;

public class MainSchool {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Student studentOne = new Student();
        Student studentTwo = new Student();



        studentOne.setName("Pablo Juan");
        studentOne.setStudenteID("21224433");
        studentOne.validateStudente();
        studentOne.setFinalGrade(75.01);
        studentOne.showStudents();
        studentOne.validateFinalGrade();

        System.out.println("---------------------------------------");

        studentTwo.setName(" ");
        studentTwo.setStudenteID("12324455");
        studentTwo.validateStudente();
        studentTwo.setFinalGrade(55.44);
        studentTwo.showStudents();
        studentTwo.validateFinalGrade();



    }
}
