package com.tlyon.容器.手写容器.LinkedList;

public class Node {


    public Node previous;        //上一个节点
    public Node next;                //下一个节点
    public Object element;        //元素数据


    public Node(Node previous, Node next, Object element) {
        super();
        this.previous = previous;
        this.next = next;
        this.element = element;
    }


    public Node(Object element) {
        super();
        this.element = element;
    }


}
