package seminar.account;

public class Professor extends Account{
    public String professorId;
    public Status status;

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public String getName(){
        return name;
    }

    public String getMajor(){
        return major;
    }

    public Status getStatus(){
        return status;
    }
}
