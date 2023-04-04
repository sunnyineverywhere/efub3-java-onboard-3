package seminar.account;

public class Person {
    private String userId;
    public String name;
    private String college;
    private String department;
    public String major;

    public String getUserId(){
        return userId;
    }
    public void setUserId(String userId){
        this.userId = userId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCollege(){
        return college;
    }
    public void setCollege(String college){
        this.college = college;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major = major;
    }
}