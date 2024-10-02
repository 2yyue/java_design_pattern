package com.fatey.liu.creational._01_simple_factory.demo03;

/**
 * @ClassName: User
 * @Description: 抽象类用户 共同方法修改个人资料，不同角色不同操作
 * @Author Liu_King
 * @Date 2024/5/14 2:47
 * @Version: v1.0
 */
public abstract class User {

    void updateInfo() {
        System.out.println("修改个人资料");
    }
    abstract void otherInfo();
}
