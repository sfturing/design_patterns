package cn.sfturing.event.eventsource;

import cn.sfturing.event.event.Event;

public interface EventSource {
    /**
     * 发出事件
     *
     * @return
     */
    Event fireEvent();

}
