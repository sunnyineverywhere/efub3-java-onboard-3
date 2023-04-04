package seminar.account;

public class Professor extends Person {
    private String professorId;
    private Status status;

    @Override
    public String getName(){
        return super.name;
    }
    @Override
    public void setMajor(String major){
        super.major=major;
    }
    @Override
    public String getMajor(){
        return super.major;
    }
    public void setStatus(Status status){
        this.status=status;
    }
    public Status getStatus(){
        return status;
    }
}