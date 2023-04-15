package seminar.account;

public class Student extends Person {
    private String studentId;
    private Grade grade;

    @Override
    public String getId() {
        return studentId;
    }

    @Override
    public void setId(String id) {
        this.studentId = id;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
