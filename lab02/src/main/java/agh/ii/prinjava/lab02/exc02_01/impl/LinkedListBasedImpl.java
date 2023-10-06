package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

public class LinkedListBasedImpl implements StackOfInts {
    /**
     *     pop() : overriding public method from StackOfInts interface, parameter : void, return type : int
     */
    @Override
    public int pop() {
        Node temp = this.first.next;
        int x = this.first.elem;
        this.first = temp;
        this.numOfElems--;
        return x;
        //throw new IllegalStateException("To be implemented");
    }

    /**
     *     push() : overriding public method from StackOfInts interface, parameter : int, return type : void
     */
    @Override
    public void push(int x) {
        Node n = new Node(x, null);
        Node temp = this.first;
        this.first = n;
        n.next = temp;
        this.numOfElems++;
        //throw new IllegalStateException("To be implemented");
    }
    /**
     * numOfElems() overriding public method from StackOfInts interface, parameter : void, return type : int
     */
    @Override
    public int numOfElems() {
        return numOfElems;
    }
    /**
     * peek() : overriding public method from StackOfInts interface, parameter : void, return type : int
     */
    @Override
    public int peek() {

        return this.first.elem;
        //throw new IllegalStateException("To be implemented");
    }

    /**
     * Node : static private nasted class
     */
    private static class Node {
        int elem;
        Node next;

        public Node(int elem, Node next) {
            this.elem = elem;
            this.next = next;
        }
    }

    private Node first = null;
    private int numOfElems = 0;
}
