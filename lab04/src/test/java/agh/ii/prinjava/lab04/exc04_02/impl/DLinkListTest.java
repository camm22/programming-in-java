package agh.ii.prinjava.lab04.exc04_02.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    /**
     * We add an element in the beginning part of the list,
     * We print then content of the list to see if our toString is working good,
     * We check that our peekFirst take the value of the first element with an assert.
     */
    @Test
    void addFirstTest(){
        dLinkList.addFirst(5);
        System.out.println(dLinkList);
        assertEquals(dLinkList.peekFirst(), 5);
    }

    /**
     * We add an element on the beginning of the list,
     * We print to check the current list,
     * We add another element on the beginning,
     * We print to check if it is well added,
     * We verify that the last element we had is 8 if so the function works.
     */
    @Test
    void addLastTest(){
        dLinkList.addFirst(5);
        System.out.println(dLinkList);
        dLinkList.addLast(8);
        System.out.println(dLinkList);
        assertEquals(dLinkList.peekLast(), 8);
    }

    /**
     * We make a test to see if our res is NULL and if our exception condition works with the message "Error : Cannot remove from an empty list !".
     */
    @Test
    void removeFirstTest1(){
        assertNull(dLinkList.removeFirst());
    }

    /**
     * We add 8 at the beginning of the list,
     * We print the list to check the well addition of 8
     * We add 9,
     * We print to verify the additional value in the list,
     * We check if when we removeFirst, 9 is the value of the removed value.
     */
    @Test
    void removeFirstTest2(){
        dLinkList.addFirst(8);
        System.out.println(dLinkList);
        dLinkList.addFirst(9);
        System.out.println(dLinkList);
        assertEquals(dLinkList.removeFirst(), 9);
    }

    /**
     * We print firstly to verify our print of empty list,
     * We add two value 8 and 9,
     * We print to see the actual list,
     * We verify that when we remove the last the value of it, it's 8.
     */
    @Test
    void removeLastTest1(){
        System.out.println(dLinkList);
        dLinkList.addFirst(8);
        dLinkList.addFirst(9);
        System.out.println(dLinkList);
        assertEquals(dLinkList.removeLast(), 8);
    }

    /**
     * We print firstly to verify our print of empty list,
     * We add one value 8,
     * We print to see the actual list,
     * We verify that when we remove the last the value of it, it's 8.
     */
    @Test
    void removeLastTest2(){
        System.out.println(dLinkList);
        dLinkList.addFirst(8);
        System.out.println(dLinkList);
        assertEquals(dLinkList.removeLast(), 8);
    }

    /**
     * We add 1, 2, 3 with addLast,
     * then we print to see if we obtain 1,2,3 in this order in the current list.
     */
    @Test
    void toStringTest(){
        dLinkList.addLast(1);
        dLinkList.addLast(2);
        dLinkList.addLast(3);
        System.out.println(dLinkList);
    }
}
