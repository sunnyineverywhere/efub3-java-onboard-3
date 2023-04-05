package seminar.account;

public class Student extends Account {
    private String studentId;
    private Grade grade;

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getMajor() {
        return major;
    }
}
