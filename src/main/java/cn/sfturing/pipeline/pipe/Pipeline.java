package cn.sfturing.pipeline.pipe;

import cn.sfturing.pipeline.context.PipelineContext;
import cn.sfturing.pipeline.pipelinevalue.PipelineValue;

public interface Pipeline {
    /**
     * 执行
     *
     * @return
     */
    boolean invoke(PipelineContext pipelineContext);

    /**
     * 添加值
     *
     * @param pipelineValue
     * @return
     */
    boolean addValue(PipelineValue pipelineValue);

    /**
     * 移除值
     *
     * @param pipelineValue
     * @return
     */
    boolean removeValue(PipelineValue pipelineValue);
}
