package com.tlyon.请求参数的注入原理;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 2021年8月19日19:26:17
 *
 * @author Lyon
 */
public class UserAction extends ActionSupport {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
