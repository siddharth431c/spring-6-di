package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.service.GreetingsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class Myi18NController {

    private final GreetingsService greetingsService;

    public Myi18NController(@Qualifier("i18nservice") GreetingsService greetingsService) {

        this.greetingsService = greetingsService;
    }

    public String sayHello(){
        return greetingsService.sayGreeting();
    }

}
