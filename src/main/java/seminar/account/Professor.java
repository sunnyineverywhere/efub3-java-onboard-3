package seminar.account;

public class Professor extends Person{
	private String professorId;
	private Status status;
	public Professor(){}// 기본 생성자


	public Professor(String userId, String name, String college, String department, String major, String professorId, Status status) {
		super(userId, name, college, department, major);
		this.professorId = professorId;
		this.status = status;
	}

	@Override
	public String getUserId() {
		return professorId;
	}

	@Override
	public void setUserId(String id) {
		this.professorId = id;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
