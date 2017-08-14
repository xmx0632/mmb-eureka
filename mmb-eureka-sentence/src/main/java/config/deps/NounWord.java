package config.deps;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mmb-eureka-client-noun")
public interface NounWord {

    @RequestMapping("/")
    public String getWord();
}
