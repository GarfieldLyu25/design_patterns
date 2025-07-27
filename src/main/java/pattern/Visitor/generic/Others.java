package pattern.Visitor.generic;

class Others<T extends Animal<T>> implements Visitor<T> {
    @Override
    public void visit(T animal) {
        String food = (animal instanceof Dog) ? "骨头" : "鱼干";
        System.out.println("路人投喂" + food);
    }
}
