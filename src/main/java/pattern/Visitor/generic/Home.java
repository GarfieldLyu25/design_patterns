package pattern.Visitor.generic;

import java.util.ArrayList;
import java.util.List;

class Home {
    private final List<Animal<?>> animals = new ArrayList<>();

    public void addPet(Animal<?> animal) {
        animals.add(animal);
    }

    // 泛型方法：允许不同类型访问者访问
    public <T extends Visitor> void accept(T visitor) {
        for (Animal<?> animal : animals) {
            // 需要类型安全检查
            if (isCompatible(visitor, animal)) {
                visitAnimal(visitor, animal);
            }
        }
    }

    // 类型兼容检查（双分派）
    private boolean isCompatible(Visitor<?> visitor, Animal<?> animal) {
        return (visitor instanceof Owner && animal instanceof Dog) ||
                (visitor instanceof Owner && animal instanceof Cat) ||
                (visitor instanceof Others);
    }

    // 安全访问方法
    @SuppressWarnings("unchecked")
    private <T> void visitAnimal(Visitor<T> visitor, Animal<T> animal) {
        animal.accept(visitor);
    }
}
