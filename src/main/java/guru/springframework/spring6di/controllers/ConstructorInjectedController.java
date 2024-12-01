package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.service.GreetingsService;
import guru.springframework.spring6di.service.GreetingsServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingsService greetingsService;

    public ConstructorInjectedController(GreetingsService greetingsService){

        this.greetingsService = greetingsService;
    }

    public String sayHello(){
        return greetingsService.sayGreeting();
    }

}
