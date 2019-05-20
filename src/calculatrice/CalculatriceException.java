package calculatrice;

public class CalculatriceException extends Exception{
    private int code;
    private String defaultMessage;

    public CalculatriceException(){
        super ();
    }

    public CalculatriceException(int code, String defaultMessage){
        this.code=code;
        this.defaultMessage=defaultMessage;
    }

    public int getCode() {
        return code;
    }

    public String getDefaultMessge() {
        return defaultMessage;
    }

    public void setDefaultMessge(String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

    public void setCode(int code) {
        this.code = code;
    }
}


