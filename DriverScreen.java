public class DriverScreen {
    public static void main(String[] args) {
        Screen screenTest = new Screen("1024x768", 60, 10);
        System.out.println("Testing functionality of screen.");
        System.out.println(screenTest.toString());
        Screen screen1 = new Screen("1024x768", 60, 10);
        System.out.println(screen1.getRefreshRate());
        System.out.println(screen1.getResolution());
        System.out.println(screen1.getResponseTime());
    }
}
