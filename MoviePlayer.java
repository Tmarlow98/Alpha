public class MoviePlayer extends Product implements MultimediaControl {

    private Screen screen;
    private MonitorType monitorType;

    public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
        super(name);
        this.screen = screen;
        this.monitorType = monitorType;
    }

    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void stop() {
        System.out.println("Stopped");
    }

    @Override
    public void previous() {
        System.out.println("Previous");
    }

    @Override
    public void next() {
        System.out.println("Next");
    }

    public String toString() {
        System.out.println(super.toString());
        return screen.toString() + "\n" +
                "MonitorType : " + monitorType;
    }
}
