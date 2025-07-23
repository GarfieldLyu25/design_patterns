package pattern.singleton.demo8;

import java.lang.reflect.Constructor;

public class Client {
    public static void main(String[] args) throws Exception {
        Class Clazz = Singleton.class;
        Constructor cons = Clazz.getDeclaredConstructor();
        cons.setAccessible(true);
        Singleton obj = (Singleton) cons.newInstance();
        Singleton obj2 = (Singleton) cons.newInstance();
        System.out.println(obj == obj2);  //false
    }
}
