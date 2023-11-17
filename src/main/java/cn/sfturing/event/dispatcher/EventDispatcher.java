package cn.sfturing.event.dispatcher;

import cn.sfturing.event.event.Event;
import cn.sfturing.event.listener.EventListener;
import org.apache.commons.collections4.CollectionUtils;

public class EventDispatcher {
    /**
     * 单例模式
     */
    private static EventDispatcher eventDispatcher = new EventDispatcher();
    private EventDispatcher() {

    }

    /**
     * 分发事件
     *
     * @param event
     * @return
     */
    public static boolean dispatchEvent(Event event) {
        if (CollectionUtils.isNotEmpty(EventListenerManager.getEventListenerList())) {
            for (EventListener eventListener :
                    EventListenerManager.getEventListenerList()) {
                if (eventListener.supportEvent(event)) {
                    eventListener.handlerEvent(event);
                }
            }
        }
        return true;
    }

}
