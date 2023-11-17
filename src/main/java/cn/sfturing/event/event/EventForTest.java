package cn.sfturing.event.event;

public class EventForTest implements Event{
    /**
     * 发出事件
     *
     * @return
     */
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

}
