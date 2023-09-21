package agh.ii.prinjava.lab01.lst01_09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloImmutableTest {
    @Test
    void testHelloImmutableTestIsImmutable(){
        HelloImmutable test = new HelloImmutable (1, "test");
        assertEquals(1, test.getI1());
    }
}