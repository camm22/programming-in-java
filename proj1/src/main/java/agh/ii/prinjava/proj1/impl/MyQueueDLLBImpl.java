package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

/**
 * Implementation of a queue using a doubly-linked list
 * @param <E> the type of element stored in the queue
 */
public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems = new DLinkList<>();

    /**
     * Enqueue an element onto the top of the queue
     * @param x the element that is about to be enqueue onto the queue
     */
    @Override
    public void enqueue(E x) {
        elems.addFirst(x);
    }

    /**
     * Removes and returns the element at the end of the queue
     * @return the element removed from the end of the queue
     */
    @Override
    public E dequeue() {
        return elems.removeLast();
    }

    /**
     * Returns the number of elements that are currently in the queue
     * @return the number of elements in the queue
     */
    @Override
    public int numOfElems() {
        return elems.getNumberOfElem();
    }

    /**
     * Returns the element that is at the end of the queue without removing it
     * @return the element on end of the queue
     */
    @Override
    public E peek() {
        return elems.peekLast();
    }

    /**
     * Returns a string representation of the queue
     * @return a string representation of the queue
     */
    @Override
    public String toString(){
        return elems.toString();
    }
}
