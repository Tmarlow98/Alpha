public class Screen implements ScreenSpec {

    //Create a class called Screen that implements ScreenSpec.  Add three fields
    private String resolution;
    private int refreshrate;
    private int responsetime;

    Screen(String resolution, int refreshrate, int responsetime) {
        this.resolution = resolution;
        this.refreshrate = refreshrate;
        this.responsetime = responsetime;
    }

    @Override
    public String getResolution() {
        return resolution;
    }

    @Override
    public int getRefreshRate() {
        return refreshrate;
    }

    @Override
    public int getResponseTime() {
        return responsetime;
    }

    @Override
    public String toString() {
        return  "resolution : " + resolution + "\n" +
                "refreshrate : " + refreshrate + "\n" +
                "responsetime: " + responsetime;
    }

}
