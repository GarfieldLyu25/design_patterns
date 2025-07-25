package pattern.Strategy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Client {
    public static void main(String[] args) {
        System.out.println("国庆了");
        SalesMan salesMan = new SalesMan(new StrategyB());
        salesMan.salesManShow();
        System.out.println("过年了");
        salesMan.setStrategy(new StrategyA());
        salesMan.salesManShow();


        Integer[] data = {12, 2, 3, 2, 4, 5, 1};
        // 实现降序排序
        Arrays.sort(data, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(data)); //[12, 5, 4, 3, 2, 2, 1]

        Arrays.sort(data);
        System.out.println(Arrays.toString(data));
    }
}
