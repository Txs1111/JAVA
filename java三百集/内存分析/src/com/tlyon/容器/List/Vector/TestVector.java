package com.tlyon.容器.List.Vector;

import java.util.List;
import java.util.Vector;

/**
 * 测试Vector
 *
 * 需要线程安全时用vector
 * vector一般在使用线程同步的时候使用
 *
 * 一般是将list替换为vector
 *
 * @author Administrator
 */
public class TestVector {
    public static void main(String[] args) {
        List<String> a = new Vector();
    }
}
