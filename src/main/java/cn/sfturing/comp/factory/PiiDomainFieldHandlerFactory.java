package cn.sfturing.comp.factory;

import cn.sfturing.comp.handler.ForTestNotSupportFieldHandler;
import cn.sfturing.comp.handler.ForTestSupportFieldHandler;
import cn.sfturing.comp.handler.PiiDomainFieldHandler;
import com.google.common.collect.Lists;

import java.util.List;

public class PiiDomainFieldHandlerFactory {
    /**
     * 创建领域处理器
     *
     * @return
     */
    public static List<PiiDomainFieldHandler> createPiiDomainFieldHandler() {
        List<PiiDomainFieldHandler> piiDomainFieldHandlerList = Lists.newArrayList();

        //
        piiDomainFieldHandlerList.add(new ForTestSupportFieldHandler());
        piiDomainFieldHandlerList.add(new ForTestNotSupportFieldHandler());

        return piiDomainFieldHandlerList;
    }

}
