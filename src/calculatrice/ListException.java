package calculatrice;

public enum ListException {
    WRONG_SIGN(1, "Mauvais signe");

    private final int code;
    private String message;

    ListException(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static String getNameFromCode(int code) {
        for (ListException e : ListException.values()) {
            if (code == e.getCode()) return e.name();
        }
        return null;
    }
}
