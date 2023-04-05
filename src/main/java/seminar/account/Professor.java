package seminar.account;

public class Professor extends Account {
    private String professorId;
    private Status status;

    public Status getStatus() {
        return status;
    }

    @Override
    public String getMajor() {
        return super.getMajor();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setMajor(String major) {
        super.setMajor(major);
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Professor(String userId, String name, String college, String department, String major, String professorId, Status status) {
        super(userId, name, college, department, major);
        this.professorId = professorId;
        this.status = status;
    }


}


