package principles.DIP;

public class KingstonMemory implements Memory {
    @Override
    public void save() {
        System.out.println("Saving KingstonMemory");
    }
}
