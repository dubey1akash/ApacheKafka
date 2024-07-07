package com.deliveryboy.DeliveryBoyApp.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
    //first like i said new to create topic for that we have take of object to topic
    @Bean
    public NewTopic topic(){
        //there is class which build topic with the name given
        return TopicBuilder.name(AppConstants.LOCATION_TOPIC_NAME).build();
    }
}
