package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.MyController;
import guru.springframework.spring6di.services.LifeCycleDemoBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class LifeCycleDemoTests {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    LifeCycleDemoBean demoBean;

    @Test
    void testGetControllerFromAutowiredController(){
        System.out.println("testing autowired controller.");
        //System.out.println(myController.sayHello());
    }

    @Test
    void testGetControllerFromCtx(){
        LifeCycleDemoBean demo = applicationContext.getBean(LifeCycleDemoBean.class);

    }

    @Test
    void contextLoads() {



    }

}
