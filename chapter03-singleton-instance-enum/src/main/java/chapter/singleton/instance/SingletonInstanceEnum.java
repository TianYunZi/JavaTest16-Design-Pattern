package chapter.singleton.instance;

/**
 * 枚举.
 */
public enum SingletonInstanceEnum {

    INSTANCE;

    public static SingletonInstanceEnum getInstance() {
        return INSTANCE;
    }
}
