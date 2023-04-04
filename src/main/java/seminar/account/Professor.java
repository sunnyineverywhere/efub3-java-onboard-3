package seminar.account;

public class Professor extends Person{
    String professorID;
    Status status;

    void setStatus(Status status){
        this.status=status;
    }

    void setMajor(String major){
        this.major=major;
    }

    String getName(){
        return name;
    }

    String getMajor(){
        return major;
    }

    Status getStatus(){
        return status;
    }


}
