package config.deps;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mmb-eureka-client-verb")
public interface VerbWord {

    @RequestMapping("/")
    public String getWord();
}
