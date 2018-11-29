package test;

import Dao.ITravelAddressDao;
import Entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ITravelAddressDaoTest {

    @Test
    public void findById() throws Exception {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        ITravelAddressDao bean = applicationContext.getBean(ITravelAddressDao.class);
        User byId = bean.findUserById(1);
        System.out.println(byId.toString());
    }
}