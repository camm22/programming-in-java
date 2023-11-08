package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

public interface MyStack<E> {

    /**
     * Removes and returns the element at the top of the stack.
     * @return the element removed from the top of the stack
     */
    E pop();

    /**
     * Push an element onto the top of the stack.
     * @param x the element that is about to be push onto the stack
     */
    void push(E x);

    /**
     *  Check if the stack is empty.
     *
     * @return {@code true} if the stack is empty, {@code false} otherwise
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * Returns the number of elements that are currently in the stack.
     *
     * @return the number of element in the stack
     */
    int numOfElems();

    /**
     * Returns the element that is at the top of the stack without removing it.
     *
     * @return the element on top of stack
     */
    E peek();

    /**
     * Consider pros and cons of having a factory method in the interface
     *This factory method creates and return an instance of MyStack
     *
     * @return an instance of MyStack
     * @param <T> the type of element stored in the stack create by the factory method
     */
    static <T> MyStack<T> create() {
        return new MyStackDLLBImpl<T>();
    }
}
