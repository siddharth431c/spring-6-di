package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.service.GreetingsService;
import guru.springframework.spring6di.service.GreetingsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingsService1")
    @Autowired
    public GreetingsService greetingsService;

    public String sayHello(){
        return greetingsService.sayGreeting();
    }

}
