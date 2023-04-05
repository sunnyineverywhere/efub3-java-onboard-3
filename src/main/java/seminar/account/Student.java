package seminar.account;



public class Student extends  Account{
    private String studentId;
    private Grade grade;

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getMajor() {
        return super.getMajor();
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }


    public Student(String userId, String name, String college, String department, String major, String studentId, Grade grade) {
        super(userId, name, college, department, major);
        this.studentId = studentId;
        this.grade = grade;
    }



}
