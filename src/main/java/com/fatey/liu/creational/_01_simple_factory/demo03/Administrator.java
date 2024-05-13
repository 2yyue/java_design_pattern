package com.fatey.liu.creational._01_simple_factory.demo03;

/**
 * @ClassName: Administrator
 * @Description: 管理员实体类 可以管理假条的用户
 * @Author Liu_King
 * @Date 2024/5/14 2:57
 * @Version: v1.0
 */
public class Administrator extends User {

    Administrator() {
        System.out.println("初始化管理员对象！");
    }
    @Override
    void otherInfo() {
        System.out.println("管理员可以管理所有假条");
    }

}
