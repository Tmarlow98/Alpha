public class AudioPlayer extends Product implements MultimediaControl {

    //We require a concrete class that will allow us to capture the
    //details of an audio player. Create a class
    //called AudioPlayer that is a subclass of Product and implements
    //the MultimediaControl interface.

    String audioSpecification;
    ItemType mediaType;

    //Create a constructor that will take in 2 parameters – name and audioSpecification.
    public AudioPlayer(String name, String audioSpecification) {

        //The constructor should call its parents constructor and also setup the media type.
        super(name);
        this.audioSpecification = audioSpecification;
        mediaType = ItemType.AUDIO;


    }

    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void previous() {
        System.out.println("Back");
    }

    @Override
    public void next() {
        System.out.println("Next");
    }


    //Create a toString method that will display the superclasses toString method, but also add rows for Audio
    //Spec and Type.
    @Override
    public String toString() {

        String tempstr = super.toString() + "\n";
        tempstr +=  "Audio Specification: " + audioSpecification + "\n" +
                "Type: " + mediaType ;
        return tempstr;

    }
}
