package agh.ii.prinjava.lab04.exc04_02.impl;

import agh.ii.prinjava.lab04.exc04_02.MyStack;

/**
 * Implementation of a stack using a doubly-linked list
 * @param <E> the type of element stored in the stack
 */
public class MyStackDLLBImpl<E> implements MyStack<E> {

    private DLinkList<E> elems = new DLinkList<>();

    /**
     * Removes and returns the element at the top of the stack
     * @return the element removed from the top of the stack
     */
    @Override
    public E pop() {
        return elems.removeFirst();
    }

    /**
     * Push an element onto the top of the stack
     * @param x the element that is about to be push onto the stack
     */
    @Override
    public void push(E x) {
        elems.addFirst(x);
    }

    /**
     * Returns the number of elements that are currently in the stack
     * @return the number of elements in the stack
     */
    @Override
    public int numOfElems() {
        return elems.getNumberOfElem();
    }

    /**
     * Returns the element that is at the top of the stack without removing it
     * @return the element on top of the stack
     */
    @Override
    public E peek() {
        return elems.peekFirst();
    }

    /**
     * Returns a string representation of the stack
     * @return a string representation of the stack
     */
    @Override
    public String toString(){
        return elems.toString();
    }
}
