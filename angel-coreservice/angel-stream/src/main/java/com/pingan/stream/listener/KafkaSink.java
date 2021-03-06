package com.pingan.stream.listener;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface KafkaSink {
    //输出通道1
    public static final String INPUT="kafka_input";

    public static final String INPUT2="kafka_input2";

    @Input(KafkaSink.INPUT)
    public SubscribableChannel input();

    @Input(KafkaSink.INPUT2)
    public SubscribableChannel input2();

}
