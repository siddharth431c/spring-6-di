package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.ConstructorInjectedController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class ConstructorInjectedControllerTest {


@Autowired
    ConstructorInjectedController constructorInjectedController;

    /*@BeforeEach
    void setUp(){
        constructorInjectedController = new ConstructorInjectedController(new GreetingsService());
    }*/

    @Test
    void sayHello(){
        System.out.println(constructorInjectedController.sayHello());
    }

}
