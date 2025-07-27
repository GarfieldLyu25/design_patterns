package pattern.Visitor.generic;

class Cat implements Animal<Cat> {
    @Override
    public void accept(Visitor<Cat> visitor) {
        visitor.visit(this);
    }

    public String meow() {
        return "喵喵叫";
    }
}
