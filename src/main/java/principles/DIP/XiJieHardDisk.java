package principles.DIP;

public class XiJieHardDisk implements HardDisk{
    @Override
    public void save(String data) {
        System.out.println("save data:" + data);
    }

    @Override
    public String load() {
        System.out.println("load data");
        return "data";
    }
}
