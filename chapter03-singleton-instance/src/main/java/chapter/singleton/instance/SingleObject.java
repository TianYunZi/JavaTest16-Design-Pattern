package chapter.singleton.instance;

public class SingleObject {

    private static SingleObject instance;

    private SingleObject() {

    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
