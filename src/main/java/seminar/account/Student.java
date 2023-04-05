package seminar.account;

public class Student extends Account{
    String studentId;
    Grade grade;

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public String getName(){
        return this.name;
    }

    public String getMajor(){
        return this.major;
    }

    public Grade getGrade() {
        return this.grade;
    }

}
