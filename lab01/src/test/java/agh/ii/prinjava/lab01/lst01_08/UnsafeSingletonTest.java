package agh.ii.prinjava.lab01.lst01_08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnsafeSingletonTest {
    @Test
    void getInstanceTest(){
        UnsafeSingleton e1 = UnsafeSingleton.getInstance();
        UnsafeSingleton e2 = UnsafeSingleton.getInstance();
        assertEquals(e1, e2);
    }
}