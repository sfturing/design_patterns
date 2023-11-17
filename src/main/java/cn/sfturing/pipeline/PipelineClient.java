package cn.sfturing.pipeline;

import cn.sfturing.pipeline.context.PipelineContext;
import cn.sfturing.pipeline.context.StandardPipelineContext;
import cn.sfturing.pipeline.pipe.Pipeline;
import cn.sfturing.pipeline.pipe.StandardPipeline;
import cn.sfturing.pipeline.pipelinevalue.ForTestValue;
import cn.sfturing.pipeline.pipelinevalue.GraySwitchValue;
import cn.sfturing.pipeline.pipelinevalue.PipelineValue;

public class PipelineClient {
    public static void main(String[] args) {
        // 管道初始化
        Pipeline pipeline = new StandardPipeline();
        // value扩展
        PipelineValue pipelineValue = new GraySwitchValue();
        PipelineValue pipelineValue2 = new ForTestValue();
        // 上下文
        PipelineContext pipelineContext = new StandardPipelineContext();
        pipeline.addValue(pipelineValue);
        pipeline.addValue(pipelineValue2);
        // 调用管道
        pipeline.invoke(pipelineContext);


    }
}
