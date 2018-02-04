package chapter.adapter.pattern.main;

import chapter.adapter.pattern.advanced.Mp4Player;
import chapter.adapter.pattern.advanced.VlcPlayer;
import chapter.adapter.pattern.media.AudioPlayer;

import java.lang.reflect.InvocationTargetException;

public class AdapterPatternDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play(AudioPlayer.class, "beyond the horizon.mp3");
        audioPlayer.play(Mp4Player.class, "alone.mp4");
        audioPlayer.play(VlcPlayer.class, "far far away.vlc");
        audioPlayer.play(Object.class, "mind me.avi");
    }
}
