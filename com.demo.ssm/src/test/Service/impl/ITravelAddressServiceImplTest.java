package Service.impl;

import Entity.User;
import Service.ITravelAddressService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ITravelAddressServiceImplTest {

    @Test
    public void findUserById() throws Exception {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        ITravelAddressService bean = applicationContext.getBean(ITravelAddressService.class);
        User userById = bean.findUserById(1);
        System.out.println(userById.toString());

    }
}