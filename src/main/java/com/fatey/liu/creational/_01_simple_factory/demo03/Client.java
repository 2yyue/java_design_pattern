package com.fatey.liu.creational._01_simple_factory.demo03;

/**
 * @ClassName: Client
 * @Description: 客户端
 * @Author Liu_King
 * @Date 2024/5/14 3:06
 * @Version: v1.0
 */
public class Client {

    public static void main(String[] args) {
        try {
            UserDao userDao = new UserDao();
            User zhangsan = UserFactory.getUser(userDao.getPermission("zhangsan", "123456"));
            zhangsan.updateInfo();
            zhangsan.otherInfo();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
