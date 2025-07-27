package pattern.Visitor.generic;

class Dog implements Animal<Dog> {
    @Override
    public void accept(Visitor<Dog> visitor) {
        visitor.visit(this);
    }

    public String bark() {
        return "汪汪叫";
    }
}
