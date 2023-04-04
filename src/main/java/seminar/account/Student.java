package seminar.account;

public class Student extends Person{
    private String studentId;
    private Grade grade;

    public void setGrade(Grade grade){
        this.grade=grade;
    }

    public Grade getGrade(){
        return grade;
    }

    @Override
    public String getName(){
        return super.name;
    }

    @Override
    public String getMajor(){
        return super.major;
    }
}
