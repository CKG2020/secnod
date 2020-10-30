//package com;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.naming.Binding;
//import java.util.Queue;
//
////RabbitMQ配置
//@Configuration
//public class RabbitMQConfig {
//
//    //三个分别是队列，交换器以及路由键
//    public static final String PUSH_MSG_EXCHANGE = "push_msg_exchange";
//
//    public static final String PUSH_MSG_QUEUE = "push_msg_queue";
//
//    public static final String PUSH_MSG_ROUTE_KEY = "push_msg.direct";
//
//    @Bean
//    public DirectExchange pushMsgExchange() {
//        return new DirectExchange(PUSH_MSG_EXCHANGE, true, true);
//    }
//
//    @Bean
//    public Queue pushMsgQueue() {
//        return new Queue(PUSH_MSG_QUEUE, true, false, true);
//    }
//
//    //将队列和交换器绑定
//    @Bean
//    public Binding pushMsgBinding() {
//        return BindingBuilder.bind(pushMsgQueue()).to(pushMsgExchange()).with(PUSH_MSG_ROUTE_KEY);
//    }
//}
//
////WebSocket配置
//@Configuration
//public class WebSocketConfig {
//
//    //只需要配置ServerEndpointExporter这个Bean就行了
//    @Bean
//    public ServerEndpointExporter serverEndpointExporter() {
//        return new ServerEndpointExporter();
//    }
//}
