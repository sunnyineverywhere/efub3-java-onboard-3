package seminar.account;

public class Professor extends Account{
    private String professorId;
    private Status status;

    @Override
    public String getId() {
        return professorId;
    }

    public Status getStatus() {
        return status;
    }
}
