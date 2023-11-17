package cn.sfturing.event.listener;

import cn.sfturing.event.event.Event;

public class EventListenerForTest implements EventListener{
    /**
     * 是否支持此事件
     *
     * @param event
     * @return
     */
    @Override
    public boolean supportEvent(Event event) {
        return event.getName().contains("Test");
    }

    /**
     * 处理事件
     *
     * @param event
     * @return
     */
    @Override
    public boolean handlerEvent(Event event) {
        System.out.println(this.getClass().getSimpleName() + "\t handler " + event.getName());
        return true;
    }
}
