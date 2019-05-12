package cn.sp.service;

import cn.sp.bean.User;

import java.util.List;

/**
 * Created by 2YSP on 2019/5/12.
 */
public interface UserService {

    /**
     * 查询所有用户
     * @return
     */
    public List<User> queryAll();
}
