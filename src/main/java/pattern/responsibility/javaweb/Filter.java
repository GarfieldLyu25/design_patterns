package pattern.responsibility.javaweb;

public interface Filter {
    public void doFilter(Request req,Response res,FilterChain c);
}
