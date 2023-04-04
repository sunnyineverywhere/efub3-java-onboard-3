package seminar.account;

public abstract class Person {
    private String userId;
    public String name;
    private String college;
    private String department;
    public String major;

    public abstract void setMajor(String major);

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(){
        this.major=major;
    }
}
