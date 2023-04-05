package seminar.account;

public class Person {
	private String userId;
	private String name;
	private String college;
	private String department;
	private String major;
	public Person() {} // 기본 생성자

	public Person(String userId, String name, String college, String department, String major) {
		this.userId = userId;
		this.name = name;
		this.college = college;
		this.department = department;
		this.major = major;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String id) {
		this.userId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
