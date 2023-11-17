package cn.sfturing.filterchain.filter;

import cn.sfturing.filterchain.filterchain.FilterChain;
import cn.sfturing.filterchain.http.HttpRequest;

public class ForTest2Filter implements Filter{
    @Override
    public void doFilter(HttpRequest httpRequest, FilterChain filterChain) {
        // do

        System.out.println(this.getClass().getSimpleName() + " before " + System.currentTimeMillis());

        filterChain.doFilter(httpRequest);

        // after

        System.out.println(this.getClass().getSimpleName() + " end " + System.currentTimeMillis());
    }
}
