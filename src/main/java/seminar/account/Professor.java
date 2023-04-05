package seminar.account;

public class Professor extends Account {

    String professorId;
    Status status;

    public void setStatus(Status status){
        this.status = status;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public String getName(){
        return this.name;
    }

    public String getMajor(){
        return this.major;
    }

    public Status getStatus(){
        return this.status;
    }
}
