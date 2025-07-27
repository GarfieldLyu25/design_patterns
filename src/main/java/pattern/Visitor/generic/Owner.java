package pattern.Visitor.generic;

// 具体访问者 - 主人（泛型实现）
class Owner<T extends Animal<T>> implements Visitor<T> {
    @Override
    public void visit(T animal) {
        if (animal instanceof Dog) {
            System.out.println("主人喂狗粮，" + ((Dog) animal).bark());
        } else if (animal instanceof Cat) {
            System.out.println("主人喂猫粮，" + ((Cat) animal).meow());
        }
    }
}