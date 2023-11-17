package cn.sfturing.comp.handler;

import java.lang.reflect.Field;

public class ForTestSupportFieldHandler extends PiiDomainFieldHandlerBase{
    /**
     * 当前处理器是否支持该领域对象
     *
     * @param domain
     * @param domainField
     * @return
     */
    @Override
    public <T> boolean isSupport(T domain, Field domainField) {
        if (this.getClass().getSimpleName().equalsIgnoreCase(domain.getClass().getSimpleName())) {

            // to do business

            System.out.println(this.getClass().getSimpleName() + " is support, to do some business");

            return true;
        }

        return false;

    }

    /**
     * 获取处理器对应的元信息
     *
     * @return
     */
    @Override
    public String getPiiDomainMeta() {
        return this.getClass().getSimpleName();
    }
}
