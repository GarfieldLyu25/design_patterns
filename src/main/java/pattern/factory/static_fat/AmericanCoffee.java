package pattern.factory.static_fat;

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
