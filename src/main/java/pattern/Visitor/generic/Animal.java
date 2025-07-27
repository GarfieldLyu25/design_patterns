package pattern.Visitor.generic;

interface Animal<T> {
    void accept(Visitor<T> visitor);
}
