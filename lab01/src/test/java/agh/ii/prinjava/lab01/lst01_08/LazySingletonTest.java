package agh.ii.prinjava.lab01.lst01_08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LazySingletonTest {
    @Test
    void getInstanceTest(){
        LazySingleton e1 = LazySingleton.getInstance();
        LazySingleton e2 = LazySingleton.getInstance();
        assertTrue(e1 == e2);
    }
}