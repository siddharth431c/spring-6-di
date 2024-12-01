package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.PropertyInjectedController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PropertyInjectedControllerTest {

    @Autowired
    PropertyInjectedController controller;

    /*@BeforeEach
    void setUp(){
        controller = new PropertyInjectedController();
        controller.greetingsService = new GreetingsService();
    }*/

    @Test
    void sayHello(){
        System.out.println(controller.sayHello());
    }

}
