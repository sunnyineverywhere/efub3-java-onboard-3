package seminar.account;

public class Student extends Account{
    private String studentId;
    private Grade grade;

    @Override
    public String getId() {
        return studentId;
    }

    public Grade getGrade() {
        return grade;
    }
}
