package pattern.responsibility.javaweb;

public class SecondFilter implements Filter {

    @Override
    public void doFilter(Request req, Response res, FilterChain c) {
        System.out.println("pre seconefilter");
        c.nextFilter(req, res);
        System.out.println("post SecondFilter");

    }
}
