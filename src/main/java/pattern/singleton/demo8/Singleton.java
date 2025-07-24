package pattern.singleton.demo8;

import java.io.Serializable;

public class Singleton implements Serializable {
    private Singleton() {
        if(SingletonHolder.INSTANCE != null) {
            throw new RuntimeException("Singleton already instantiated");
        }
    }
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
