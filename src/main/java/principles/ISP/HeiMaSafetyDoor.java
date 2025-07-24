package principles.ISP;

public class HeiMaSafetyDoor implements AntiTheft,Fireproof,Waterproof{
    @Override
    public void antiTheft() {
        System.out.println("HeiMaSafetyDoor antiTheft");
    }

    @Override
    public void fireproof() {
        System.out.println("HeiMaSafetyDoor fireproof");
    }

    @Override
    public void waterproof() {
        System.out.println("HeiMaSafetyDoor waterproof");
    }
}
