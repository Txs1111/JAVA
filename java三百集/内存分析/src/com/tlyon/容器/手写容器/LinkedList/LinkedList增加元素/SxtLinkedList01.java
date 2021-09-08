package com.tlyon.容器.手写容器.LinkedList.LinkedList增加元素;


import com.tlyon.容器.手写容器.LinkedList.Node;

/**
 * 自定义一个链表
 *
 * @author Administrator
 */
@SuppressWarnings("all")
public class SxtLinkedList01 {
    private Node first;
    private Node last;
    private int size;

    public void add(Object obj) {
        Node node = new Node(obj);
        if (first == null) {
//			node.previous = null;
//			node.next = null;
            first = node;
            last = node;
        } else {
            node.previous = last;
            node.next = null;
            last.next = node;
            last = node;    //让最后一个节点等于node
        }
    }

    @Override
    public String toString() {
        //[a,b,c]     first=a,    last=c
        //a,b,c
        StringBuilder sb = new StringBuilder("[");
        Node temp = first;
        while (temp != null) {
            sb.append(temp.element + ",");
            temp = temp.next;
        }
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }

    public static void main(String[] args) {
        SxtLinkedList01 list = new SxtLinkedList01();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        System.out.println(list);


    }


}
