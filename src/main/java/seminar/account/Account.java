package seminar.account;

public class Account {
    private String userId;
    public String name;
    private String college;
    private String department;
    public String major;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major=major;
    }
}
