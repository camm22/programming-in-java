package agh.ii.prinjava.lab01.lst01_09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloImmutableTest {
    @Test
    void testHelloImmutableTestIsEqual(){
        HelloImmutable test = new HelloImmutable (1, "test");
        HelloImmutable test1 = new HelloImmutable (1, "test");
        assertTrue(test.equals(test1));
    }

    @Test
    void testHelloImmutableTestIsHashSame(){
        HelloImmutable test = new HelloImmutable (1, "test");
        HelloImmutable test1 = new HelloImmutable (1, "test");
        assertEquals(test.hashCode(), test1.hashCode());
    }

    @Test
    void testHelloImmutableTestIstoStringIsSame(){
        HelloImmutable test = new HelloImmutable (1, "test");
        HelloImmutable test1 = new HelloImmutable (1, "test");
        assertEquals(test.toString(), test1.toString());
    }
}