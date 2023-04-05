package seminar.account;

public enum Status {
    ROSEWORD(0, "ROSEWORD"),
    ANGEL(1, "ANGEL"),
    NOT_BAD(2, "NOT_BAD"),
    BAD(3, "BAD");

    private final Integer id;
    private final String title;

    Status(Integer id, String title) {
        this.id = id;
        this.title = title;
    }
}
