package colors;

public enum ColorCodes {
    ErrorColor("\u001B[31m"),
    CorrectionColor("\u001B[34m"),
    ImpartionalColor("\u001B[37m"),
    SucessColor("\u001B[32m");

    private String code;
    ColorCodes(String code){
        this.code = code;
    }

    /**
     * @return String return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

}

