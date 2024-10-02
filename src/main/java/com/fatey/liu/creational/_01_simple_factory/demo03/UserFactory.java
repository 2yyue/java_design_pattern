package com.fatey.liu.creational._01_simple_factory.demo03;

/**
 * @ClassName: UserFactory
 * @Description: 用户工厂类，通过不同权限创建不同类型用户对象
 * @Author Liu_King
 * @Date 2024/5/14 2:58
 * @Version: v1.0
 */
public class UserFactory {

    static User getUser(int permission) {
        if (permission == 0) {
            return new Employee();
        } else if (permission == 1) {
            return new Administrator();
        } else if (permission == 2) {
            return new Manager();
        } else {
            System.out.println("权限不够，默认创建员工对象");
            return new Employee();
        }
    }
}
