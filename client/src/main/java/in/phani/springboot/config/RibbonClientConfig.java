package in.phani.springboot.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by panikiran on 07.04.17.
 */
@Configuration
@RibbonClient(name = "greeting", configuration = RibbonConfig.class)
public class RibbonClientConfig {

  @LoadBalanced
  @Bean
  RestTemplate restTemplate(){
    return new RestTemplate();
  }
}
