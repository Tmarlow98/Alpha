public class DriverAudioPlayer {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer("My Player", "My Spec");
        System.out.println("Created an audio player, calling methods.");
        System.out.println(player);
        player.play();
        player.previous();
        player.next();
        player.stop();
    }
}
