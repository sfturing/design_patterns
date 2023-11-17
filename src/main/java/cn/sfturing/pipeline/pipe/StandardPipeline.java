package cn.sfturing.pipeline.pipe;

import cn.sfturing.pipeline.context.PipelineContext;
import cn.sfturing.pipeline.pipelinevalue.PipelineValue;
import com.google.common.collect.Lists;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
@Data
@Slf4j
public class StandardPipeline implements Pipeline {

    private List<PipelineValue> pipelineValueList = Lists.newArrayList();
    /**
     * 执行
     *
     * @param pipelineContext
     * @return
     */
    @Override
    public boolean invoke(PipelineContext pipelineContext) {
        boolean isResult = true;
        for (PipelineValue pipelineValue :
                pipelineValueList) {
            try {
                isResult = pipelineValue.execute(pipelineContext);
                if (!isResult) {
                    log.error("{},exec is wrong", pipelineValue.getClass().getSimpleName());
                }

            } catch (Exception e) {
                log.error(e.getMessage(), e);
            }
        }

        return isResult;

    }

    /**
     * 添加值
     *
     * @param pipelineValue
     * @return
     */
    @Override
    public boolean addValue(PipelineValue pipelineValue) {
        if (pipelineValueList.contains(pipelineValue)) {
            return true;
        }

        return pipelineValueList.add(pipelineValue);

    }

    /**
     * 移除值
     *
     * @param pipelineValue
     * @return
     */
    @Override
    public boolean removeValue(PipelineValue pipelineValue) {
        return pipelineValueList.remove(pipelineValue);    }
}
