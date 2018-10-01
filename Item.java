import java.util.Date;

public interface Item {

    //    A constant called manufacturer that would be set to “OracleProduction”.
    final String manufacturer = "OracleProduction";

    //    A method setProductionNumber that would have one integer parameter
    public void setProductionNumber(int productionNumber);

    //    A method setName that would have one String parameter
    public void setName(String name);

    //    A method getName that would return a String
    public String getName();

    //    A method getManufactureDate that would return a Date
    public Date getManufactureDate();

    //    A method getSerialNumber that would return an int
    public int getSerialNumber();

}
