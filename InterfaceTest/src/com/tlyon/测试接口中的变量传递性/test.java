package com.tlyon.测试接口中的变量传递性;

import org.junit.Test;

public class test  implements 测试变量传递性{

    @Override
    @Test
    public void testInterface() {
        //这一步是打印他的接口中定义的a
        System.out.println(a);
        System.out.println(b);
    }

    @Override
    public void testInterface2(int ta) {

    }
}
