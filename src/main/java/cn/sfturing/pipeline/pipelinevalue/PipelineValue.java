package cn.sfturing.pipeline.pipelinevalue;

import cn.sfturing.pipeline.context.PipelineContext;

public interface PipelineValue {

    /**
     * 节点执行
     *
     * @param pipelineContext
     * @return
     */
    boolean execute(PipelineContext pipelineContext);
}
