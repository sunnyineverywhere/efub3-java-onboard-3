package seminar.account;


public class Account {
    private String userId;
    private String name;
    private String college;
    private String department;
    private String major;

    public Account(String userId, String name, String college, String department, String major) {
        this.userId = userId;
        this.name = name;
        this.college = college;
        this.department = department;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
