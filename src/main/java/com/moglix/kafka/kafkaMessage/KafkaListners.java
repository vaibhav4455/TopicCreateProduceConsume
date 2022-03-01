package com.moglix.kafka.kafkaMessage;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListners{
    @KafkaListener(
            topics="moglixorder",
            groupId = "groupId"
    )
    void  listners(String data){
        System.out.println("listner received"+data);
    }
}
