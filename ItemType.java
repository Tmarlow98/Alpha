public enum ItemType {

    //Create an enum called ItemType that will store the following information

    AUDIO("AU"),
    VISUAL("VI"),
    AUDOMPBILE("AM"),
    VISUALmOBILE("VM");

    //private variable that stays constant throughout program
    private final String code;

    ItemType (String code) {

        this.code = code;
    }

    public String getCode() {

        return code;
    }
}
