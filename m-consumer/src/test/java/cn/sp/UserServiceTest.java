package cn.sp;

import cn.sp.bean.User;
import cn.sp.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by 2YSP on 2019/5/12.
 */
public class UserServiceTest {

    private UserService userService;

    @Before
    public void setUp()throws Exception{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:dubbo/dubbo-*.xml");
        userService = applicationContext.getBean(UserService.class);
    }

    @Test
    public void testQueryAll(){
        List<User> users = userService.queryAll();
        users.forEach(user -> System.out.println(user.toString()));
    }
}
