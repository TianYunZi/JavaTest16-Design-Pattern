package chapter.singleton.instance;

public class SingletonInstanceHungry {
    private static SingletonInstanceHungry instance = new SingletonInstanceHungry();

    private SingletonInstanceHungry() {
    }

    public static SingletonInstanceHungry getInstance() {
        return instance;
    }
}
