package com.fatey.liu.creational._01_simple_factory.demo03;

/**
 * @ClassName: Employee
 * @Description: 员工实体类 可以请假的用户
 * @Author Liu_King
 * @Date 2024/5/14 2:49
 * @Version: v1.0
 */
public class Employee extends User {

    Employee() {
        System.out.println("初始化员工对象！");
    }
    @Override
    void otherInfo() {
        System.out.println("员工有请假权限");
    }

}
