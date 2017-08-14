package config.deps;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mmb-eureka-client-article")
public interface ArticleWord {

    @RequestMapping("/")
    public String getWord();
}
