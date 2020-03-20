package com.yunhua.git;

import com.yunhua.git.domain.User;


public class MainDemo {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("yunhua");
        user1.setAge("25");
        System.out.println(user1);
        System.out.println("======================");
        System.out.println("测试代码同步功能");
        for (int i = 0; i <10 ; i++) {
            System.out.println(i+"测试忽略文件的问题");
        }

    }
}
