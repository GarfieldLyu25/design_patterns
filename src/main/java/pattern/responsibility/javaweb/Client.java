package pattern.responsibility.javaweb;

public class Client {
    //递归实现
    public static void main(String[] args) {
        Request req = null;
        Response resp = null;
        FilterChain chain = new FilterChain();
        chain.addFilter(new FirstFilter()).addFilter(new SecondFilter());
        chain.nextFilter(req, resp);
    }
}
