package cn.sp.service.impl;

import cn.sp.bean.User;
import cn.sp.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 2YSP on 2019/5/12.
 */
@Component
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {

    @Override
    public List<User> queryAll() {
        // 模拟查询数据库
        List<User> userList = new ArrayList<>(100);
        for(int i=1;i < 101;i++){
            User user  = new User();
            user.setId((long) i);
            user.setUsername("username_"+i);
            user.setPassword("xxxx");
            userList.add(user);
        }
        return userList;
    }
}
