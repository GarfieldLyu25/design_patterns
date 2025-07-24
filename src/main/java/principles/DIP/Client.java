package principles.DIP;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setCpu(new IntelCpu());
        computer.setMemory(new KingstonMemory());
        computer.setHardDisk(new XiJieHardDisk());
        computer.run();
    }
}
