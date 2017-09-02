package config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * Created by mmb on 2016/8/1.
 */
@Component
public class Service {
    private static final Logger logger = LoggerFactory.getLogger(Service.class);

    @Autowired
    DiscoveryClient client;

    public String getWord(String service) {
        List<ServiceInstance> list = client.getInstances(service);

        Runnable t = new Runnable( ){
            final Logger log = LoggerFactory.getLogger(Runnable.class);

            @Override
            public void run() {
                log.info("ttt ttt ");
            }
        };
        Thread thread = new Thread(t);
        thread.start();

        if (list != null && list.size() > 0 ) {
            URI uri = list.get(0).getUri();
            if (uri !=null ) {
                logger.info("uri:" + uri);
                return (new RestTemplate ()).getForEntity(uri,String.class).getBody();
            }
        }
        return null;
    }
}
