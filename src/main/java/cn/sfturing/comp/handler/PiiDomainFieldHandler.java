package cn.sfturing.comp.handler;

import cn.sfturing.comp.context.PiiContent;

import java.lang.reflect.Field;

public interface PiiDomainFieldHandler {
    /**
     * 处理实际操作
     * 读----从PiiContent获取数据回填domain
     *
     * @param domain
     * @param domainField
     * @param piiContent
     * @param <T>
     * @return
     */
    <T extends Object> boolean handlerRead(T domain, Field domainField, PiiContent piiContent);

    /**
     * 处理实际操作
     * 写----将domain中需要写入pii的字段数据写入PiiContent
     *
     * @param domain
     * @param domainField
     * @param piiContent
     * @param <T>
     * @return
     */
    <T extends Object> boolean handlerWrite(T domain, Field domainField, PiiContent piiContent);

    /**
     * 当前处理器是否支持该领域对象
     *
     * @param domain
     * @param domainField
     * @param <T>
     * @return
     */
    <T extends Object> boolean isSupport(T domain, Field domainField);

    /**
     * 获取处理器对应的元信息
     *
     * @return
     */
    String getPiiDomainMeta();
}
