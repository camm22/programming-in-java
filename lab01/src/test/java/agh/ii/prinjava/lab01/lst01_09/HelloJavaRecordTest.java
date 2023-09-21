package agh.ii.prinjava.lab01.lst01_09;

import agh.ii.prinjava.lab01.lst01_01.HelloEncapsulation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloJavaRecordTest {
    @Test
    void testHelloJavaRecordTestIsEquals(){
        HelloJavaRecord test = new HelloJavaRecord(2, "test2");
        HelloJavaRecord test1 = new HelloJavaRecord(2, "test2");
        assertTrue(test.equals(test1));
    }

    @Test
    void testHelloJavaRecordTestIsHashSame() {
        HelloJavaRecord test = new HelloJavaRecord(2, "test2");
        HelloJavaRecord test1 = new HelloJavaRecord(2, "test2");
        assertEquals(test.hashCode(), test1.hashCode());
    }

    @Test
    void testHelloJavaRecordTestIstoStringIsSame() {
        HelloJavaRecord test = new HelloJavaRecord(2, "test2");
        HelloJavaRecord test1 = new HelloJavaRecord(2, "test2");
        assertEquals(test.toString(), test1.toString());
    }

}