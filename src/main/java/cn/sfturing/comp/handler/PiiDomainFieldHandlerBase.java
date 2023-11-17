package cn.sfturing.comp.handler;

import cn.sfturing.comp.context.PiiContent;

import java.lang.reflect.Field;

public abstract class PiiDomainFieldHandlerBase implements PiiDomainFieldHandler{
    @Override
    public <T extends Object> boolean handlerRead(T domain, Field domainField, PiiContent piiContent) {
        // to do business read

        return true;
    }

    @Override
    public <T extends Object> boolean handlerWrite(T domain, Field domainField, PiiContent piiContent) {

        // to do business write

        return true;
    }

}
