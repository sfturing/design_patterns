package cn.sfturing.pipeline.pipelinevalue;

import cn.sfturing.pipeline.context.PipelineContext;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
@Data
@Slf4j
public class ForTestValue extends AbstractPipelineValue{
    @Override
    protected boolean doExec(PipelineContext pipelineContext) {
        pipelineContext.set(PipelineContext.FOR_TEST, false);
        System.out.println("执行了ForTestValue,FOR_TEST的值为:"+pipelineContext.get(PipelineContext.FOR_TEST));
        return false;
    }
}
