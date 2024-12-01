package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.SetterInjectedController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SetterInjectedControllerTest {

    @Autowired
    SetterInjectedController controller;

    /*@BeforeEach
    void setUp(){
        controller = new SetterInjectedController();
        controller.setGreetingsService(new GreetingsService());
    }*/

    @Test
    void sayHello(){
        System.out.println(controller.sayHello());
    }

}
