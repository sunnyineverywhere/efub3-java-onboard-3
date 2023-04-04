package seminar.account;

public class Professor extends Account{
    private String professorId;
    private Status status;

    public void setStatus(Status status){
        this.status=status;
    }

    @Override
    public void setMajor(String major){
        super.major=major;
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
