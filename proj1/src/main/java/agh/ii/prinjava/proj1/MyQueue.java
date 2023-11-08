package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

/**
 * MyQueue - abstract data type
 *
 * @param <E> type of the elements stored in the Queue
 */
public interface MyQueue<E> {

    /**
     * Enqueue an element on the current queue
     *
     * @param x the element that is about to be enqueue in the queue
     */
    void enqueue(E x);

    /**
     * Removes and returns the element at the end of the queue
     * @return the element at the end of the queue
     */
    E dequeue();

    /**
     * Check if the queue is empty
     * @return {@code true} if the queue is empty, {@code false} otherwise
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * returns the number of elements on the queue
     * @return the number of elements
     */
    int numOfElems();

    /**
     * return the element that is at the end of the queue without removing it
     * @return the element at the end of the queue
     */
    E peek();


    /**
     * Consider pros and cons of having a factory method in the interface
     * factory method that create and return an instance of MyQueue
     * @return an instance of MyQueue
     * @param <T> the type of the element stored in the instance of the queue
     */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}
