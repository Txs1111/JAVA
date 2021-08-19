package com.tlyon.Servlet监听器统计在线人数;

import java.util.ArrayList;

/**
 * 2021年8月19日14:44:42
 *
 * @author Lyon
 */
public class UserInfoList {
    private static UserInfoList userInfoList = new UserInfoList();
    private ArrayList<String> ArrayList;

    public UserInfoList() {
        this.ArrayList = new ArrayList<String>();
    }

    //外界使用的instance对象
    public static UserInfoList getInstance() {
        java.util.ArrayList<String> strings = new ArrayList<String>();
        strings.add("测试1");
        userInfoList.ArrayList=strings;
        return userInfoList;
    }

    //增加用户
    public boolean addUserInfo(String user) {
        if (user != null) {
            java.util.ArrayList<String> strings = new ArrayList<String>();
            strings.add("测试2");
            userInfoList.ArrayList=strings;
            ArrayList.add(user);
            return true;
        } else {
            return false;
        }
    }

    //获取用户列表
    public ArrayList getList() {
        return ArrayList;
    }

    //移除用户
    public void removeUserInfo(String user) {
        if (user != null) {
            ArrayList.remove(user);
        }
    }
}
