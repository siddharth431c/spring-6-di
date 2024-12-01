package guru.springframework.spring6di.service;

import org.springframework.stereotype.Service;

@Service("propertyGreetingsService1")
public class GreetingServicePropertyInjected implements GreetingsService {


    @Override
    public String sayGreeting() {
        return "Greetings from qualified Greetings Service!";
    }
}
