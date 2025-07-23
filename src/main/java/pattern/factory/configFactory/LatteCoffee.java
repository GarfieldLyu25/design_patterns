package pattern.factory.configFactory;

public class LatteCoffee extends Coffee {

    @Override
    public String getName() {
        return "拿铁";
    }

    @Override
    public void addsugar() {
        System.out.println("加糖");
    }

    @Override
    public void addMilk() {
        System.out.println("加奶");
    }
}
