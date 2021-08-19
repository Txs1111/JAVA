package com.tlyon.Servlet监听器统计在线人数;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * 2021年8月19日14:54:25
 *
 * @author Lyon
 */
public class UserInfoTrace implements HttpSessionBindingListener {
    private String user;
    private UserInfoList contaniner = UserInfoList.getInstance();

    public UserInfoTrace() {
        user = "";
    }

    //设置在线监听人员
    public void setUser(String user) {
        this.user = user;
    }

    //获取在线监听人员
    public String getUser() {
        return this.user;
    }

    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("上线" + this.user);
    }

    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("下线" + this.user);
        if (user != null) {
            contaniner.removeUserInfo(user);
        }
    }
}
