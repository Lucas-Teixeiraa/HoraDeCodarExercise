package SectionPOO.Exercise02;

public class Student {
    private String name;
    private String studenteID;
    private double finalGrade;

    //Default Student
    public Student(String name, String studenteID, double finalGrade){
        this.name = name;
        this.studenteID = studenteID;
        this.finalGrade = finalGrade;
    }


    public String getStudenteID() {
        return studenteID;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public String getName() {
        return name;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    public void setStudenteID(String studenteID) {
        this.studenteID = studenteID;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void validateStudent(){
        if(this.studenteID.trim().isEmpty()){
            System.out.println("Student ID can not be empty");
        }
        if(this.name.trim().isEmpty()){
            System.out.println("Student name can not be empty");
        }
    }

    public void validateFinalGrade(){
        if(this.finalGrade > 74.99 && this.finalGrade < 100.0){
            System.out.println("Studente Approved!");
        }else {
            System.out.println("You will have to redo the test.");
        }
    }


    public void showStudents(){
        System.out.println(
                "Student Name: " + getName() +
                "\nStudent ID: " + getStudenteID() +
                "\nFinal Exame: " + getFinalGrade());
    }


}
