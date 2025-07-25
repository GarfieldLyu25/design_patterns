package pattern.Flyweight;

public class Client {
    public static void main(String[] args) {
        AbstractBox box = BoxFactory.getInstance().getBox("I");
        box.display("red");
        AbstractBox box2 = BoxFactory.getInstance().getBox("L");
        box2.display("green");
        AbstractBox box3 = BoxFactory.getInstance().getBox("O");
        box3.display("blue");
        AbstractBox box4 = BoxFactory.getInstance().getBox("O");
        box4.display("black");
        System.out.println(box3 == box4);
    }
}
