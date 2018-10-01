import java.util.Date;

public abstract class Product implements Item {

    int serialNumber;
    Date manufacuredOn;
    String name;

    static int currentProductionNumber;
        public Product(String name) {
            this.name = name;
            serialNumber = currentProductionNumber++;
            manufacuredOn = new Date();
        }

        //    A constant called manufacturer that would be set to “OracleProduction”.
        final String manufacturer = "OracleProduction";

        //    A method setProductionNumber that would have one integer parameter
        public void setProductionNumber(int productionNumber) {

            serialNumber = productionNumber;
        }

        //    A method setName that would have one String parameter
        public void setName(String name) {
            this.name = name;
        }

        //    A method getName that would return a String
        public String getName() {
            return name;
        }

        //    A method getManufactureDate that would return a Date
        public Date getManufactureDate() {
            return manufacuredOn;
        }

        //    A method getSerialNumber that would return an int
        public int getSerialNumber() {
            return serialNumber;
        }

        // A method that displays the data to user
        public String toString() {
            return "Manufacturer : " + manufacturer + "\n" +
                    "Serial Number : " + serialNumber + "\n" +
                    "Date : " + manufacuredOn + "\n" +
                    "Name : " + name;
        }


}
