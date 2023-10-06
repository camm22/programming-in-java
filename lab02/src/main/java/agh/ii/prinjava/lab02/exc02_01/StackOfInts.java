package agh.ii.prinjava.lab02.exc02_01;

/**
 * Stack of integers - Abstract Data Type (ADT)
 */

public interface StackOfInts {
    /**
     * pop() abstract public method, parameter : void, return type : int
     */
    int pop();
    /**
     * push() abstract public method, parameter : int x, return type : void
     */
    void push(int x);
    /**
     * isEmpty() default method, parameter : void, return type : boolean
     */

    default boolean isEmpty() {
        return numOfElems() == 0;
    }
    /**
     * numOfElems() abstract public method, parameter : void, return type : int
     */
    int numOfElems();

    /**
     * peek() abstract public method, parameter : void, return type : int
     */
    int peek();
}
