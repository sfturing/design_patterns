package cn.sfturing.event.eventsource;

import cn.sfturing.event.event.Event;
import cn.sfturing.event.event.EventForTest;

public class EventSourceForTest implements EventSource{
    /**
     * 发出事件
     *
     * @return
     */
    @Override
    public Event fireEvent() {
        Event event = new EventForTest();
        System.out.println(getClass().getSimpleName() + " \t fireEvent " + event.getName());
        return event;

    }
}
