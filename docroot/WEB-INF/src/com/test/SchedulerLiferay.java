package com.test;

import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;

public class SchedulerLiferay implements MessageListener {

    @Override
    public void receive(Message arg0) throws MessageListenerException {
        System.out.println("hello world");

    }

}
