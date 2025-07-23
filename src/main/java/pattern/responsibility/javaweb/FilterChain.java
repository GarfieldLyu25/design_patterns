package pattern.responsibility.javaweb;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private int index = 0;
    public FilterChain addFilter(Filter filter) {
        this.filters.add(filter);
        return this;
    }
    public void nextFilter(Request request, Response response) {
        if (index == filters.size()) {
            return;
        }
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request, response, this);
    }
}
