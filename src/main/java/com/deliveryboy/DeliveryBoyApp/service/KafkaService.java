package com.deliveryboy.DeliveryBoyApp.service;


import com.deliveryboy.DeliveryBoyApp.config.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
    //this is class to produce message the topic
    //with the help of kafka template you can send the message to topic
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    //this is class used for logging
    private Logger logger = LoggerFactory.getLogger(KafkaService.class);
    public boolean updateLocation(String location){
        this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME,location);
        this.logger.info("location produced");
        return true;
    }

}
