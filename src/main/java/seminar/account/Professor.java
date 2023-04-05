package seminar.account;

public class Professor extends Person{
	private String professorId;
	private Status status;

	@Override
	public String getId() {
		return professorId;
	}

	@Override
	public void setId(String id) {
		this.professorId = id;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
