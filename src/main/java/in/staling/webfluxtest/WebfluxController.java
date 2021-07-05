package in.staling.webfluxtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class WebfluxController {

    @GetMapping("/hello/{name}")
    public Mono<String> sayHello(@PathVariable("name") String name) {
        return Mono.just("Hello " + name);
    }

    @GetMapping("/hi/{name}")
    public String sayHi(@PathVariable("name") String name) {
        return "Hi " + name;
    }

}