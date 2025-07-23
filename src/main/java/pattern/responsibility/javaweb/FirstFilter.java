package pattern.responsibility.javaweb;

public class FirstFilter implements Filter {

    @Override
    public void doFilter(Request req, Response res, FilterChain c) {
        System.out.println("pre Filter");
        c.nextFilter(req, res);
        System.out.println("post FirstFilter");

    }
}
