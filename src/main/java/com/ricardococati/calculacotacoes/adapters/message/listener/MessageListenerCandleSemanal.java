package com.ricardococati.calculacotacoes.adapters.message.listener;

import static com.ricardococati.calculacotacoes.entities.contantes.Topics.CANDLESTICK_SEMANAL;

import com.ricardococati.calculacotacoes.adapters.message.executor.MessageExecutorCandleSemanal;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MessageListenerCandleSemanal {

  private final MessageExecutorCandleSemanal messageExecutorCandleSemanal;

  @KafkaListener(topics = CANDLESTICK_SEMANAL)
  public void consume(final ConsumerRecord consumerRecord) {
    messageExecutorCandleSemanal.execute(consumerRecord.value().toString());
  }
}
