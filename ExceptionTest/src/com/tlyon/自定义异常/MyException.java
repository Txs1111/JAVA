package com.tlyon.自定义异常;

import org.junit.Test;

public class MyException {

    public void exc(int a) throws testMyException {
        if (a <= 0) throw new testMyException("你的输入小于等于0");
        else throw new testMyException("你的输入大于等于0");
    }

    @Test
    public void test() {
        try {
            exc(-1);
//            exc(1);
        } catch (testMyException e) {
            e.printStackTrace();
        }
    }

}

class testMyException extends Exception {

    public testMyException(String a) {
        super(a);
    }
}
