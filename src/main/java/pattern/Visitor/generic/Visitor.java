package pattern.Visitor.generic;

interface Visitor<T> {
    void visit(T element);
}