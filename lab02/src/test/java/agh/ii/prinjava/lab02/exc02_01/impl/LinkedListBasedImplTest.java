package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedListBasedImplTest {

    // Create an empty stack
    private final StackOfInts stackOfInts = StackOfIntsFtry.create(StackOfIntsFtry.Impln.L_LIST_B);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void newStackIsEmpty() {
        assertTrue(stackOfInts.isEmpty());
    }

    @Test
    void pushTest(){
        LinkedListBasedImpl linkedList = new LinkedListBasedImpl();
        linkedList.push(5);
        assertEquals(1, linkedList.numOfElems());
    }

    @Test
    void poopTest(){
        LinkedListBasedImpl linkedList = new LinkedListBasedImpl();
        linkedList.push(5);

        assertEquals(5, linkedList.pop());
    }

}