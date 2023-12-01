package com.microservices.demo.twitter.to.kafka.service.configurations;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix="twitter-to-kafka-service")
public class TwitterToKafkaServiceConfigData {
	private List<String> twitterKeywords;
}
