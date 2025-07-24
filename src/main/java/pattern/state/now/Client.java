package pattern.state.now;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.open();
        context.close();
        context.run();
        context.open();
        context.stop();
    }
}
