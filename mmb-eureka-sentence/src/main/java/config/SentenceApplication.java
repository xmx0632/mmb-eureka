package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by mmb on 2016/8/1.
 */
@SpringBootApplication
@EnableEurekaClient

@EnableFeignClients // 启用feign
@EnableDiscoveryClient // 启动服务发现
public class SentenceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SentenceApplication.class,args);
    }

}
