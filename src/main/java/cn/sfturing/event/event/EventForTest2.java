package cn.sfturing.event.event;

public class EventForTest2 implements Event{
    /**
     * 事件名称
     *
     * @return
     */
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
