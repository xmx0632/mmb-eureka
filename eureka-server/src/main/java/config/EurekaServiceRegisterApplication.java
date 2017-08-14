package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by mmb on 2016/7/31.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceRegisterApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceRegisterApplication.class, args);
    }
}
