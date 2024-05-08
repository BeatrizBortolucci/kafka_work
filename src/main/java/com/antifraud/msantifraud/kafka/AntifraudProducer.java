package com.antifraud.msantifraud.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class AntifraudProducer<T> {
    private Producer<String, T> producer;

    public AntifraudProducer() {
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092"); // replace with your Kafka brokers
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class); // replace with your serializer

        this.producer = new KafkaProducer<String, T>(props);
    }

    public void send(String topic, T message) {
        ProducerRecord<String, T> record = new ProducerRecord<>(topic, message);
        producer.send(record);
    }
}