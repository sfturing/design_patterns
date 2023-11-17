package cn.sfturing.filterchain.filterchain;

import cn.sfturing.filterchain.filter.Filter;
import cn.sfturing.filterchain.http.HttpRequest;

public interface FilterChain {

    void doFilter(HttpRequest httpRequest);

    void addFilter(Filter filter);

}
