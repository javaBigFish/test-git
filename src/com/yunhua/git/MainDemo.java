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
        System.out.println("测试分支功能");
        testBranches();
    }
    public static void testBranches(){
        int i=0;
        for (i = 0; i <10 ; i++) {
            System.out.println(i);
        }
    }
}
