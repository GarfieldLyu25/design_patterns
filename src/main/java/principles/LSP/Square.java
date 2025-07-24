package principles.LSP;

public class Square implements Quadrilateral {

    double side;
    @Override
    public double getLength() {
        return side;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getWidth() {
        return side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() { return side * side; }

    public void setWidth(double v) {
        side = v;
    }
}
