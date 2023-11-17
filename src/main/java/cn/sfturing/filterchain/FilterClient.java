package cn.sfturing.filterchain;

import cn.sfturing.filterchain.filter.ForTest1Filter;
import cn.sfturing.filterchain.filter.ForTest2Filter;
import cn.sfturing.filterchain.filterchain.FilterChain;
import cn.sfturing.filterchain.filterchain.StandardFilterChain;
import cn.sfturing.filterchain.http.StandardHttpRequest;

public class FilterClient {

    public static void main(String[] args) {
        FilterChain filterChain = new StandardFilterChain();
        filterChain.addFilter(new ForTest1Filter());
        filterChain.addFilter(new ForTest2Filter());
        filterChain.doFilter(new StandardHttpRequest());

    }
}
