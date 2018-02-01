package chapter.singleton.instance;

/**
 * 登记式/静态内部类.
 */
public class SingletonInstanceStaticInnerClass {

    private static class SingletonHolder {
        private static final SingletonInstanceStaticInnerClass INSTANCE = new SingletonInstanceStaticInnerClass();
    }

    public static SingletonInstanceStaticInnerClass getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
