package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/grettings")
public class GreetingController {
    @GetMapping
    private Mono<String> getGreeting() {
        return Mono.just("Hello World");
    }
}
