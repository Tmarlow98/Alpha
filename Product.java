/*
 * Name: Tyler Marlow
 * Class: COP 3003
 * Professor: Vanselow
 * Description: follow JP using classes and instances that creates a program
 * that gives manufacturer, serial number, date, and the name of the product
 */

import java.util.Date;

public abstract class Product implements Item {

    int serialNumber;
    Date manufacuredOn;
    String name;
    String manufacturer;



    static int currentProductionNumber = 1;
        public Product(String name) {
            this.name = name;
            serialNumber = currentProductionNumber++;
            manufacuredOn = new Date();
            manufacturer = Item.manufacturer;
        }

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
