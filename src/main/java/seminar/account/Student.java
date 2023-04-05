package seminar.account;

public class Student extends Account{
    String studentId;

    public void setGrade(Grade grade){
        this.grade = grade;
    }

    public String getName(){
        return name;
    }

    public String getMajor(){
        return major;
    }

    public Grade getGrade(){
        return grade;
    }
}
