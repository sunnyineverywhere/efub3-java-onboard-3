package seminar.account;

public enum Grade {
    FRESHMAN(0, "1학년"),
    SOPHOMORE(1, "2학년"),
    JUNIOR(2, "3학년"),
    SENIOR(3, "4학년");

    private final Integer id;
    private final String title;

    Grade(Integer id, String title){
        this.id = id;
        this.title = title;
    }

    public Integer getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }
}
