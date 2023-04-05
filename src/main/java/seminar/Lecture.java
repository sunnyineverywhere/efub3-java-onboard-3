package seminar;

public class Lecture {
    private String lectureId;
    private String major;
    private String name;
    private String professorId;
    private Integer total;

    public String getLectureId() {
        return lectureId;
    }

    public void setLectureId(String lectureId) {
        this.lectureId = lectureId;
    }

    public String getMajor() {
        return major;
    }

    public String getName() {
        return name;
    }

    public String getProfessorId() {
        return professorId;
    }

    public Integer getTotal() {
        return total;
    }
}
