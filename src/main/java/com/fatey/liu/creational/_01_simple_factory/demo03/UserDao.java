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
        if (Objects.equals(userName, "zhangsan") && Objects.equals(userPassword, "123456")) {
            return 0;
        } else {
            return -1;
        }
    }

}
