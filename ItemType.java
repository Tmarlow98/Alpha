/*
 * Name: Tyler Marlow
 * Class: COP 3003
 * Professor: Vanselow
 * Description: follow JP using classes and instances that creates a program
 * that gives manufacturer, serial number, date, and the name of the product
 */

public enum ItemType {

    //Create an enum called ItemType that will store the following information

    AUDIO("AU"),
    VISUAL("VI"),
    AUDIOMOBILE("AM"),
    VISUALMOBILE("VM");

    //private variable that stays constant throughout program
    private final String code;

    ItemType (String code) {

        this.code = code;
    }

    public String getCode() {

        return code;
    }
}
