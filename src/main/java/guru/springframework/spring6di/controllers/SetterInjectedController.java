package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.service.GreetingsService;
import guru.springframework.spring6di.service.GreetingsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {


    private GreetingsService greetingsService;

    public GreetingsService getGreetingsService() {
        return greetingsService;
    }

    @Autowired
    public void setGreetingsService(GreetingsService greetingsService) {
        System.out.println("SetterInjectedController.setGreetingsService");
        this.greetingsService = greetingsService;
    }

    public String sayHello(){
        return greetingsService.sayGreeting();
    }
}
