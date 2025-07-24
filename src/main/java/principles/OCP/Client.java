package principles.OCP;

public class Client {
    public static void main(String[] args) {
        SouGouInput souInput = new SouGouInput();
        souInput.setSkin(new HeimaSpecificSkin());
        souInput.display();
    }
}
