package cn.sfturing.event.listener;

import cn.sfturing.event.event.Event;

public interface EventListener {
    /**
     * 是否支持此事件
     *
     * @param event
     * @return
     */
    boolean supportEvent(Event event);

    /**
     * 处理事件
     *
     * @return
     */
    boolean handlerEvent(Event event);

}
