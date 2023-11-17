package cn.sfturing.comp.context;

import com.google.common.collect.Maps;

import java.util.Map;

public class PiiContent {
    public static String FORTEST="fortest";

    private Map<String, Object> piiDataMap = Maps.newHashMap();

    private Map<String, Object> piiContextMap = Maps.newHashMap();

    public void putPiiData(String domainFieldName, Object domainFieldValue) {
        piiDataMap.put(domainFieldName, domainFieldValue);
    }

    public Object getPiiData(String domainFieldName) {
        return piiDataMap.get(domainFieldName);
    }
    public void putPiiContext(String contextName, Object contextNameValue) {
        piiContextMap.put(contextName, contextNameValue);
    }

    public Object getPiiContext(String contextName) {
        return piiContextMap.get(contextName);
    }


}
