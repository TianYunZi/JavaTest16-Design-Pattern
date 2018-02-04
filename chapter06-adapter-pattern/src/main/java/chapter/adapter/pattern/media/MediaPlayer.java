package chapter.adapter.pattern.media;

import chapter.adapter.pattern.advanced.AdvancedMediaPlay;

import java.lang.reflect.InvocationTargetException;

public interface MediaPlayer{
    void play(Class<?> audioType, String fileName) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException;
}
