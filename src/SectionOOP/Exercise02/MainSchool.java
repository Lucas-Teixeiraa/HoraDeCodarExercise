package SectionOOP.Exercise02;

import java.util.Scanner;

public class MainSchool {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Student studentOne = new Student("Luigi", "228392121", 100);
        Student studentTwo = new Student("Mario", " ", 20);



        studentOne.setName("Pablo Juan");
        studentOne.setStudenteID("21224433");
        studentOne.validateStudent();
        studentOne.setFinalGrade(75.01);
        studentOne.showStudents();
        studentOne.validateFinalGrade();

        System.out.println("---------------------------------------");

        studentTwo.setName(" ");
        studentTwo.setStudenteID("12324455");
        studentTwo.validateStudent();
        studentTwo.setFinalGrade(55.44);
        studentTwo.showStudents();
        studentTwo.validateFinalGrade();



    }
}
