package config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * Created by mmb on 2016/8/1.
 */
@RestController
public class Controller {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Autowired
    Service service;

    @RequestMapping("/sentence")
    public  String getSentence() {
        return
                getWord("mmb-eureka-client-subject") + " "
                        + getWord("MMB-EUREKA-CLIENT-VERB") + " "
                        + getWord("mmb-eureka-client-article") + " "
                        + getWord("mmb-eureka-client-adjective") + " "
                        + getWord("mmb-eureka-client-noun") + "."
                ;
    }

    public String getWord(String serviceName){
        return service.getWord(serviceName);
    }

}
