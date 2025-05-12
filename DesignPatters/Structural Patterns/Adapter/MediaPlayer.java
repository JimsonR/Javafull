package Adapter;
// Adapter
// Allows incompatible interfaces to work together by
// wrapping an existing class with a new interface
public interface MediaPlayer {
    void play(String fileName);
}

class MP3Player implements MediaPlayer{
    public void play(String fileName){
        System.out.println("Playing MP3 file: "+ fileName);
    }

}
class MP4Player{
public void playMP4(String fileName){
    System.out.println("Playing MP4 file: "+ fileName);
}
class MediaAdapter implements MediaPlayer{
    private MP4Player mp4Player = new MP4Player();
    public void play(String fileName){
        mp4Player.playMP4(fileName);
    }
}
}
