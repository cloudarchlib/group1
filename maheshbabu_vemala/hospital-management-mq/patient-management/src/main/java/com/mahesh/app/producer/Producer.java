package com.mahesh.app.producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.UncategorizedJmsException;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;


@Component
public class Producer {
    private static final Logger LOGGER = LoggerFactory.getLogger(Producer.class);
    private final JmsTemplate jmsTemplate;

    @Value("${jms.queue.destination}")
    String destinationQueue;

    public Producer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @Retryable(value = { UncategorizedJmsException.class }, maxAttemptsExpression = "${artemis.retry.maxattempt}",
            backoff = @Backoff(random = true, delayExpression = "${artemis.retry.delay}",
                    maxDelayExpression = "${artemis.retry.maxdelay}", multiplierExpression = "${artemis.retry.multiplier}"))
    public void send(String msg) {
        LOGGER.info("Sending Data:");
        jmsTemplate.convertAndSend(destinationQueue, msg);
        LOGGER.info("Data Sent:");
    }



}
