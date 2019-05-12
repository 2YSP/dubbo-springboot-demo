package cn.sp;

import cn.sp.bean.User;
import cn.sp.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboConsumerApplicationTests {


	@Reference
	private UserService userService;

	
	@Test
	public void contextLoads() {
		List<User> users = userService.queryAll();
		users.forEach(user -> System.out.println(user));
	}

}
