package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * We add 5 to the current queue,
     * We print the current queue.
     */
    @Test
    void enqueueTest(){
        queueOfInts.enqueue(5);
        System.out.println(queueOfInts.toString());
    }

    /**
     * We add 1 to the current queue,
     * We print it's content,
     * We add 2 and 3,
     * We print the new queue to affirm changes,
     * We check if the dequeue value is 1.
     */
    @Test
    void enqueueTest2(){
        queueOfInts.enqueue(1);
        System.out.println(queueOfInts.toString());
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);
        System.out.println(queueOfInts.toString());
        assertEquals(queueOfInts.dequeue(), 1);
    }

    /**
     * We add 1 and 2 to the current queue,
     * We print the current queue,
     * We dequeue the last value,
     * We print the current queue and watch if the value has been removed,
     * We check now if the last value to dequeue is 2.
     */
    @Test
    void dequeueTest(){
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        System.out.println(queueOfInts.toString());
        queueOfInts.dequeue();
        System.out.println(queueOfInts.toString());
        assertEquals(queueOfInts.dequeue(),2);
    }

    /**
     * We add 44 and 216,
     * We print the current queue,
     * We check if the last value of the queue is 44.
     */
    @Test
    void peekTest(){
        queueOfInts.enqueue(44);
        queueOfInts.enqueue(216);
        System.out.println(queueOfInts.toString());
        assertEquals(queueOfInts.peek(), 44);
    }
}
