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

        System.out.println("测试合并分支的功能，dev分支");
    }
    public static void testBranches(){
        int i=0;
        for (i = 0; i <10 ; i++) {
            System.out.println(i);
        }
        for (int j = 0; j <10 ; j++) {
            System.out.println(i+"测试忽略文件的问题");
        }

    }
}
