package chapter.adapter.pattern.media;

import chapter.adapter.pattern.adapter.MediaAdapter;
import chapter.adapter.pattern.advanced.AdvancedMediaPlay;
import chapter.adapter.pattern.advanced.Mp4Player;
import chapter.adapter.pattern.advanced.VlcPlayer;

import java.lang.reflect.InvocationTargetException;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;


    @Override
    public void play(Class<?> audioType, String fileName) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //播放 mp3 音乐文件的内置支持
        if (audioType == AudioPlayer.class) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if (audioType == VlcPlayer.class
                || audioType == Mp4Player.class) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " +
                    audioType + " format not supported");
        }
    }
}
