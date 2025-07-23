package pattern.state.now;


public class Context {
    public final static OpenningState openningState = new OpenningState();
    public final static ClosingState closeingState = new ClosingState();
    public final static RunningState runningState = new RunningState();
    public final static StoppingState stoppingState = new StoppingState();

    private LifeState liftState;
    public LifeState getLiftState() {
        return this.liftState;
    }
    public void setLiftState(LifeState lifeState) {
        this.liftState = lifeState;
        this.liftState.setContext(this);
    }
    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }

}
