# RabbitMQ

Exemplo de configuração, producer e consumer

### Tecnologias
* Java 17
* Docker
* Spring 3.4.3
* RabbitMQ

## Configurações
### *Docker*
* Rodar comando no docker para criar e subir um container do RabbirMQ
```
docker run -d --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management
```
### *RAbbitMQ*
Configurado consumer para log da msg, podendo ser retirado o consumer e verificar nas configurações abaixo:

#### Web
* http://localhost:15672
* Login: guest
* Senha: guest

#### Docker

* Acessar o container
```
docker exec -it rabbitmq bash
```
* Listar filas
```
rabbitmqctl list_queues
```
* Detalhes das filas
```
rabbitmqctl list_queues name messages_ready messages_unacknowledged
```
