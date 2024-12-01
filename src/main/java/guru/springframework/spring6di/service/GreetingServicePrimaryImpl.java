package guru.springframework.spring6di.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimaryImpl implements GreetingsService{
    @Override
    public String sayGreeting() {
        return "Hello from primary greetings service!";
    }
}
