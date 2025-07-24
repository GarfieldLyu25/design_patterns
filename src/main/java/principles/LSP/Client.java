package principles.LSP;

public class Client {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        rectangle.getArea();
        resize(rectangle);
        print(rectangle);
        Square square = new Square(5);
        resize(square);
        print(square);

    }

    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() < rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }
    public static void print(Rectangle rectangle) {
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
    public static void resize(Square square) {
        while (square.getWidth() < square.getLength()){
            square.setWidth(square.getWidth() + 1);
        }
    }
    public static void print(Square square) {
        System.out.println(square.getLength());
        System.out.println(square.getWidth());

    }

}
