package pattern.Builder.noDirector;


public class Client {
    public static void main(String[] args) {
        Bike bike = new OfoBuilder().Build();
        Bike bike1 = new MobikeBuilder().Build();
        System.out.println(bike.getFrame());
        System.out.println(bike1.getFrame());
        System.out.println(bike.getSeat());
        System.out.println(bike.getSeat());
    }

}
