package in.phani.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by panikiran on 07.04.17.
 */
@RestController
public class ClientController {

  private final RestTemplate restTemplate;

  @Autowired
  public ClientController(final RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @GetMapping("/greet")
  public String greet(){
    return this.restTemplate.getForObject("http://greeting", String.class);
  }

}
