package guru.springframework.spring6di.service;

import org.springframework.stereotype.Service;


@Service
public class GreetingsServiceImpl implements GreetingsService {

    @Override
    public String sayGreeting(){
        return "Hello from greetings service!";
    }

}
