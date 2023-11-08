package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * We add 5 to the current stack,
     * We print the current stack.
     */
    @Test
    void pushTest(){
        stackOfInts.push(5);
        System.out.println(stackOfInts.toString());
   }

    /**
     * We add 1 to the current stack,
     * We print it's content,
     * We add 2 and 3,
     * We print the new stack to affirm changes,
     * We check if the pop value is 3.
     */
   @Test
    void pushTest2(){
        stackOfInts.push(1);
        System.out.println(stackOfInts.toString());
        stackOfInts.push(2);
        stackOfInts.push(3);
        System.out.println(stackOfInts.toString());
        assertEquals(stackOfInts.pop(), 3);
   }

    /**
     * We add 1 and 2 to the current stack,
     * We print the current stack,
     * We pop the first value,
     * We print the current stack and watch if the value has been removed,
     * We check now if the first value to pop is 1.
     */
   @Test
    void popTest(){
       stackOfInts.push(1);
       stackOfInts.push(2);
       System.out.println(stackOfInts.toString());
       stackOfInts.pop();
       System.out.println(stackOfInts.toString());
       assertEquals(stackOfInts.pop(),1);
   }

    /**
     * We add 42 and 213,
     * We print the current stack,
     * We check if the last value of the stack is 44.
     */
   @Test
    void peekTest(){
        stackOfInts.push(42);
        stackOfInts.push(213);
        System.out.println(stackOfInts.toString());
        assertEquals(stackOfInts.peek(), 213);
   }
}
