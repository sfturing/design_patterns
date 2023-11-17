package cn.sfturing.pipeline.pipelinevalue;

import cn.sfturing.pipeline.context.PipelineContext;
import cn.sfturing.pipeline.pipelinevalue.PipelineValue;

public abstract class AbstractPipelineValue implements PipelineValue {
    @Override
    public boolean execute(PipelineContext pipelineContext) {

        System.out.println(this.getClass().getSimpleName() + " start ");

        boolean result = doExec(pipelineContext);

        System.out.println(this.getClass().getSimpleName() + " end ");

        return result;
    }

    protected abstract boolean doExec(PipelineContext pipelineContext);

}
