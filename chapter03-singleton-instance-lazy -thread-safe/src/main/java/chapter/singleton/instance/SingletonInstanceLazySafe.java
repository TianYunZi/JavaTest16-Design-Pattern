package chapter.singleton.instance;

public class SingletonInstanceLazySafe {

    private static SingletonInstanceLazySafe instance;

    private SingletonInstanceLazySafe() {

    }

    public static synchronized SingletonInstanceLazySafe getInstance() {
        if (instance == null) {
            return new SingletonInstanceLazySafe();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
