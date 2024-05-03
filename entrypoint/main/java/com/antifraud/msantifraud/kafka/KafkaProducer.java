package com.antifraud.msantifraud.kafka;

//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.stream.function.StreamBridge;
//import org.springframework.messaging.Message;
//import org.springframework.messaging.support.MessageBuilder;
//import org.springframework.stereotype.Component;
//
//import java.util.Map;
//import java.util.UUID;

@Component
public class KafkaProducer<T> {

//    private static final String CORRELATION_ID = "correlationId";
//    private static final String APPLICATION_NAME = "applicationName";
//    private static final String CONTENT_TYPE = "contentType";
//    private static final String CONTENT_TYPE_VALUE = "application/json";
//
//    @Value("${spring.application.name:#{ms-insurance-life}}")
//    private String applicationName;
//
//    private final StreamBridge streamBridge;
//    private final ObjectMapper objectMapper;
//
//    public void publish(T event, String binding, String correlationId) {
//        var headers = getDefaultHeaders(correlationId);
//
//        try {
//            String jsonMessage = objectMapper.writeValueAsString(event);
//            Message<String> message = MessageBuilder
//                    .withPayload(jsonMessage)
//                    .copyHeaders(headers).build();
//
//            streamBridge.send(binding, message);
//        } catch (Exception e) {
//            throw new PublishTopicException(e);
//        }
//    }
//
//    private Map<String, String> getDefaultHeaders(String correlationId) {
//        return Map.of(
//                CORRELATION_ID, (correlationId == null) ? UUID.randomUUID().toString() : correlationId,
//                APPLICATION_NAME, applicationName,
//                CONTENT_TYPE, CONTENT_TYPE_VALUE);
//    }

}