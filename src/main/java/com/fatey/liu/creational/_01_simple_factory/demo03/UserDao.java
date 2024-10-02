package com.fatey.liu.creational._01_simple_factory.demo03;

import java.util.Objects;

/**
 * @ClassName: UserDao
 * @Description: 用户数据访问类
 * @Author Liu_King
 * @Date 2024/5/14 3:03
 * @Version: v1.0
 */
public class UserDao {

    public int getPermission(String userName, String userPassword) {
        // if (Objects.equals(userName, "zhangsan") && Objects.equals(userPassword, "123456")) {
        //     return 0;
        // } else {
        //     return -1;
        // }
        // 通过修改返回值，可以实现不同权限的用户访问
        return "zhangsan".equals(userName) && "123456".equals(userPassword) ? 2 : -1;
    }

}
