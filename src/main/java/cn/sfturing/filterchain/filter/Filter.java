package cn.sfturing.filterchain.filter;

import cn.sfturing.filterchain.filterchain.FilterChain;
import cn.sfturing.filterchain.http.HttpRequest;

public interface Filter {

    void doFilter(HttpRequest httpRequest, FilterChain filterChain);

}
