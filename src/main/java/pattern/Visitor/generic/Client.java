package pattern.Visitor.generic;

public class Client {
    //不建议用这个版本
    public static void main(String[] args) {
        Home home = new Home();
        home.addPet(new Dog());
        home.addPet(new Cat());

        System.out.println("===== 主人喂食 =====");
        home.accept(new Owner<>());

        System.out.println("===== 路人喂食 =====");
        home.accept(new Others<>());
    }
}
