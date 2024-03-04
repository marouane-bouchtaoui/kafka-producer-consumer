package com.bouchtaouimarouane.kafkapbc.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopic {

    @Bean
    public NewTopic bouchtaouiTopic(){
        return TopicBuilder.name("bouchtaoui")
                .build();
    }

    @Bean
    public NewTopic jsonBouchtaouiTopic() {
        return TopicBuilder
                .name("bouchtaoui_json")
                .build();
    }
}
