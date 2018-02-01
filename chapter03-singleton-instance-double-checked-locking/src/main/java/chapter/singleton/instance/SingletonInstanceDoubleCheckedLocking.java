package chapter.singleton.instance;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）.
 */
public class SingletonInstanceDoubleCheckedLocking {
    private static volatile SingletonInstanceDoubleCheckedLocking instance;

    private SingletonInstanceDoubleCheckedLocking() {
    }

    public static SingletonInstanceDoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (SingletonInstanceDoubleCheckedLocking.class) {
                if (instance == null) {
                    return new SingletonInstanceDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
