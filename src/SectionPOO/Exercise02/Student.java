package SectionPOO.Exercise02;

public class Student {
    private String name;
    private String studenteID;
    private double finalGrade;

    //Default Student
    public Student(){
        this.name = "Joe Doe";
        this.studenteID = "21899992";
        this.finalGrade = 70.0;
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


    public void validateStudente(){
        if(!this.studenteID.isEmpty()){
            System.out.println("Student ID can not be empty");
        }
        if(!this.name.isEmpty()){
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
