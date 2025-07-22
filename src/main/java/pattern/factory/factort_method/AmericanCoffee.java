package pattern.factory.factort_method;

public class AmericanCoffee extends Coffee {

    @Override
    public String getName() {
        return "美式咖啡";
    }

    @Override
    public void addsugar() {
        System.out.println("不加糖");
    }

    @Override
    public void addMilk() {
        System.out.println("不加奶");
    }
}
