package agh.ii.prinjava.lab01.lst01_09;

import agh.ii.prinjava.lab01.lst01_01.HelloEncapsulation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloJavaRecordTest {
    @Test
    void testHelloJavaRecordTestIsRecord(){
        HelloJavaRecord test = new HelloJavaRecord(2, "test2");
        assertEquals("test2", test.s1());
    }
}