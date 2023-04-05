package seminar.account;

public class Student extends Person{
	private String studentId;
	private Grade grade;

	public Student(){}// 기본 생성자


	public Student(String userId, String name, String college, String department, String major, String studentId, Grade grade) {
		super(userId, name, college, department, major);
		this.studentId = studentId;
		this.grade = grade;
	}

	@Override
	public String getUserId() {
		return studentId;
	}

	@Override
	public void setUserId(String id) {
		this.studentId = id;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

}
