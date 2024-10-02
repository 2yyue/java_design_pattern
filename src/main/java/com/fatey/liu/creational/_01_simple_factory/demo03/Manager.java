package com.fatey.liu.creational._01_simple_factory.demo03;

/**
 * @ClassName: Manager
 * @Description: 经理实体类 可以请假也审批假条的用户
 * @Author Liu_King
 * @Date 2024/5/14 2:54
 * @Version: v1.0
 */
public class Manager extends User {

    Manager() {
        System.out.println("初始化经理对象！");
    }
    @Override
    void otherInfo() {
        System.out.println("经理可以请假，可以审批员工假条");
    }
}
