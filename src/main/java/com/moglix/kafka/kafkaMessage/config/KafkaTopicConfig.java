
package com.moglix.kafka.kafkaMessage.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic moglixTopic(){
        return TopicBuilder.name("moglixorder")
                .build();
    }
}
