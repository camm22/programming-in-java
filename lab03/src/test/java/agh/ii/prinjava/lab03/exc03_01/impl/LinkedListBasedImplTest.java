package agh.ii.prinjava.lab03.exc03_01.impl;

import agh.ii.prinjava.lab03.exc03_01.QueueOfInts;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedListBasedImplTest {

    // Create an empty queue
    private final QueueOfInts queueOfInts = QueueOfIntsFtry.create(QueueOfIntsFtry.Impln.L_LIST_B);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void newQueueIsEmpty() {
        assertTrue(queueOfInts.isEmpty());
    }

    @Test
    void enqueueListTest(){
        LinkedListBasedImpl list = new LinkedListBasedImpl();
        list.enqueue(4);
        assertEquals(4, list.peek());
    }

    @Test
    void dequeueListTest(){
        LinkedListBasedImpl list2 = new LinkedListBasedImpl();
        list2.enqueue(4);
        list2.enqueue(5);
        list2.dequeue();
        assertEquals(5, list2.dequeue());
    }
}
