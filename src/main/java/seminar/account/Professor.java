package seminar.account;

public class Professor extends Account{
    private String professorId;
    private Status status;

    public void setStatus(Status status){
        this.status=status;
    }

    public void setMajor(){
    }
    @Override
    public String getName(){
        return super.name;
    }
    @Override
    public String getMajor(){
        return super.major;
    }
    public Status getStatus(){
        return status;
    }
}
