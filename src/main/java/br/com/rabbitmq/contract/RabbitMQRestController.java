package br.com.rabbitmq.contract;

import br.com.rabbitmq.service.RabbitMQProducer;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbitmq")
@RequiredArgsConstructor
@Tag(name = "RabbitMQ")
public class RabbitMQRestController {

    private final RabbitMQProducer producer;

    @PostMapping("/send")
    @Operation(description = "Producer RabbitMQ")
    public String sendMessage(@RequestParam String message) {
        producer.sendMessage(message);
        return "Mensagem enviada: " + message;
    }

}
