package seminar.account;

public class Student extends Account{
    private String studentId;
    private Grade grade;

    public void setGrade(Grade grade){
        this.grade= grade;
    }
    @Override
    public String getName(){
        return super.name;
    }
    @Override
    public String getMajor(){
        return super.major;
    }
    public Grade getGrade(){
        return grade;
    }

}
