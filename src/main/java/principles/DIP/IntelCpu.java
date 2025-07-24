package principles.DIP;

public class IntelCpu implements Cpu {
    @Override
    public void run() {
        System.out.println("Intel CPU");
    }
}
