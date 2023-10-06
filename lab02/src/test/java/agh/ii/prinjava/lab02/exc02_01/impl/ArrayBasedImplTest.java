package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayBasedImplTest {

    // Create an empty stack
    private final StackOfInts stackOfInts = StackOfIntsFtry.create(StackOfIntsFtry.Impln.ARRAY_B);

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
    void testPush(){
        ArrayBasedImpl arrayBasedImpl = new ArrayBasedImpl();
        arrayBasedImpl.push(1);
        arrayBasedImpl.push(2);
        arrayBasedImpl.push(3);
        arrayBasedImpl.push(4);
        arrayBasedImpl.push(5);

        assertEquals(5, arrayBasedImpl.numOfElems());
    }

    @Test
    void testPop(){
        ArrayBasedImpl arrayBasedImpl = new ArrayBasedImpl();
        arrayBasedImpl.push(10);
        assertEquals(10, arrayBasedImpl.pop());
    }
}