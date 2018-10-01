import java.lang.String;
/*
    * Name: Tyler Marlow
    * Class: COP 3003
    * Professor: Vanselow
    * Description: follow JP using classes and instances that creates a program
    * that gives manufacturer, serial number, date, and the name of the product
 */
public class Main {

    public static void main(String[] args) {
        //creates new object p1 from class widget
        Widget p1 = new Widget();
        System.out.println(p1.toString());
        Widget p2 = new Widget();
        System.out.println(p2.toString());

    }


    public static class Widget extends Product {

        public Widget() {

            super ("name");
        }
    }
}
