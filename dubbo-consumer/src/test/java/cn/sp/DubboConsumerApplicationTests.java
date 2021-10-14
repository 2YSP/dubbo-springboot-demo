package cn.sp;

import cn.sp.bean.User;
import cn.sp.service.UserService;
import cn.sp.spi.Robot;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboConsumerApplicationTests {


	@Reference(check = false)
	private UserService userService;

	
	@Test
	public void contextLoads() {
		List<User> users = userService.queryAll();
		users.forEach(user -> System.out.println(user));
	}

	@Test
	public void testSpi(){
		ExtensionLoader<Robot> loader = ExtensionLoader.getExtensionLoader(Robot.class);
		Robot bumblebee = loader.getExtension("bumblebee");
		System.out.println(bumblebee.sayHello());
		Robot optimusPrime = loader.getExtension("optimusPrime");
		System.out.println(optimusPrime.sayHello());
	}

}
