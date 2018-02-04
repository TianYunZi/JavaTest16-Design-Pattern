package chapter.adapter.pattern.adapter;

import chapter.adapter.pattern.advanced.AdvancedMediaPlay;
import chapter.adapter.pattern.advanced.Mp4Player;
import chapter.adapter.pattern.advanced.VlcPlayer;
import chapter.adapter.pattern.media.MediaPlayer;

import java.lang.reflect.InvocationTargetException;

public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlay advancedMediaPlay;

    public MediaAdapter(Class<?> clazz) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        advancedMediaPlay = (AdvancedMediaPlay) Class.forName(clazz.getName()).getConstructor().newInstance();
    }

    @Override
    public void play(Class<?> audioType, String fileName) {
        if (audioType == VlcPlayer.class) {
            advancedMediaPlay.playVlc(fileName);
        } else if (audioType == Mp4Player.class) {
            advancedMediaPlay.playMp4(fileName);
        }
    }
}
