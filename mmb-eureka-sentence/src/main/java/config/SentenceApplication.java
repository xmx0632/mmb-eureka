package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by mmb on 2016/8/1.
 */
@SpringBootApplication
@EnableEurekaClient

@EnableFeignClients // 启用feign
@EnableDiscoveryClient // 启动服务发现
public class SentenceApplication {

    @Bean // 定义rest客户端
    @LoadBalanced // 开启直接调用restTemplate负载均衡能力
    RestTemplate restTemplate(){
        return new RestTemplate ();
    }

    public static void main(String[] args) {
        SpringApplication.run(SentenceApplication.class,args);
    }

}
