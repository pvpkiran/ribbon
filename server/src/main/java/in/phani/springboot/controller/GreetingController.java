package in.phani.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by panikiran on 07.04.17.
 */
@RestController
public class GreetingController {
  private static final List<String> greetings = Arrays.asList("Namaste", "Gutentag", "Hallo", "NiHao", "Bonjour");

  @Value("${server.port}")
  private int port;

  @GetMapping
  public String greet(){
    Random rand = new Random();

    int randomNum = rand.nextInt(greetings.size());

    return String.format("Today's Greeting : %s. Served by server running on %s",greetings.get(randomNum), port);
  }
}
