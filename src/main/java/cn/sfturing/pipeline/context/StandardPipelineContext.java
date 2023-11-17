package cn.sfturing.pipeline.context;

import cn.sfturing.pipeline.context.PipelineContext;
import com.google.common.collect.Maps;

import java.util.Map;

public class StandardPipelineContext implements PipelineContext {
    private Map<String, Object> contentMap = Maps.newConcurrentMap();

    /**
     * 设置
     *
     * @param contextKey
     * @param contextValue
     */
    @Override
    public void set(String contextKey, Object contextValue) {
        contentMap.put(contextKey, contextValue);
    }

    /**
     * 获取值
     *
     * @param contextKey
     * @return
     */
    @Override
    public Object get(String contextKey) {
        return contentMap.get(contextKey);
    }
}
