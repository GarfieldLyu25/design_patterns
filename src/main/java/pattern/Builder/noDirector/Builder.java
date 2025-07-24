package pattern.Builder.noDirector;

public abstract class Builder {
    protected Bike mBike = new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();

    public Bike Build() {
        this.buildFrame();
        this.buildSeat();
        return this.createBike();
    }
}
