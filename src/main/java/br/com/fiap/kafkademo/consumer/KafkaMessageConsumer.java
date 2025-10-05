package br.com.fiap.kafkademo.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessageConsumer {
    private static final Logger log = LoggerFactory.getLogger(KafkaMessageConsumer.class);

    //Escute o tópico específico. o groupId vem do application.properties
    @KafkaListener(topics = "${app.kafka.topic.meu-topico}",
                    groupId = "${spring.kafka.consumer.group-id}")
    public void listenGroupMeuGrupo(String message) {
        log.info("[CONSUMIDOR SIMPLES] Recebida mensagem do grupo '{}': {}",
                "${spring.kafka.consumer.group-id}", message);
    }

    @KafkaListener(topics = "$app.kafka.topic.meu-topico}",
                    groupId = "meu-grupo-detalhado", // outro grupo consumindo o mesmo tópico
                    properties = {"auto.offset.reset=earliest"} // é possível sober propriedades
    )
    public void listenWithHeaders(
            @Payload String message,
            @Header(KafkaHeaders.RECEIVED_KEY) String key,
            @Header(KafkaHeaders.RECEIVED_PARTITION) int partition,
            @Header(KafkaHeaders.OFFSET) long offset,
            @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
            @Header(KafkaHeaders.GROUP_ID) String groupId
    ) {
        log.info("[CONSUMIDOR DETALHADO] Recebida mensagem: " +
                "Payload='{}', Key='{}', Partition='{}', Offset='{}', Topic='{}', GroupId='{}'",
                message, key, partition, offset, topic, groupId);
    }
}
