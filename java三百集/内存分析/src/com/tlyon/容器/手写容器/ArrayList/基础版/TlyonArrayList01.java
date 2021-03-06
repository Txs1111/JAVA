package com.tlyon.容器.手写容器.ArrayList.基础版;


/**
 * 自定义实现一个ArrayList，体会底层原理
 *
 * @author 高淇
 */
public class TlyonArrayList01 {

    private Object[] elementData;
    private int size;

    private static final int DEFALT_CAPACITY = 10;


    public TlyonArrayList01() {
        elementData = new Object[DEFALT_CAPACITY];
    }

    public TlyonArrayList01(int capacity) {
        elementData = new Object[capacity];
    }

    public void add(Object obj) {
        elementData[size++] = obj;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //[a,b,c]
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elementData[i] + ",");
        }
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }


    public static void main(String[] args) {
        TlyonArrayList01 s1 = new TlyonArrayList01(20);
        s1.add("aa");
        s1.add("bb");

        System.out.println(s1);

    }


}
