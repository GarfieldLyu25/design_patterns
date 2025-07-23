package pattern.factory.configFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class CoffeeFactory {
    private static Map<String, Coffee> coffeeMap = new HashMap();

    static {
        Properties coffeeProperties = new Properties();
        InputStream in = CoffeeFactory.class.getClassLoader().getResourceAsStream("coffee.properties");
        try{
            coffeeProperties.load(in);
            Set<Object> keys = coffeeProperties.keySet();
            for (Object key : keys) {
                String classname = coffeeProperties.getProperty((String) key);
                Coffee coffee = (Coffee) Class.forName(classname).newInstance();
                coffeeMap.put((String) key, coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Coffee createCoffee(String name) {
        return coffeeMap.get(name);
    }
}
