package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.Myi18NController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("English")
@SpringBootTest
public class My18NControllerTestEN {

    @Autowired
    Myi18NController controller;

    @Test
    void sayHello(){
        System.out.println(controller.sayHello());
    }

}
