package com.tlyon.Servlet监听器统计在线人数;

import java.util.ArrayList;

/**
 * 2021年8月19日14:44:42
 *
 * @author Lyon
 */
public class UserInfoList {
    private static UserInfoList user = new UserInfoList();
    private ArrayList<String> ArrayList = null;

    public UserInfoList() {
        this.ArrayList = new ArrayList<String>();
    }

    //外界使用的instance对象
    public static UserInfoList getInstance() {
        return user;
    }

    //增加用户
    public boolean addUserInfo(String user) {
        if (user != null) {
            this.ArrayList.add(user);
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
