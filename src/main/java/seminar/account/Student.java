package seminar.account;

public class Student extends Person{
    String studentID;
    Grade grade;

    //grade 변경
    void setGrade(Grade grade){ this.grade=grade; }

    String getName(){ return name; }

    String getMajor() {return major; }

    Grade getGrade(){ return grade; }

}
