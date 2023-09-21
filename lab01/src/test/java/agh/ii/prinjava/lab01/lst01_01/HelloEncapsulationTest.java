package agh.ii.prinjava.lab01.lst01_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloEncapsulationTest {
    @Test
    void setPropValTest(){
        HelloEncapsulation test = new HelloEncapsulation(1);
        int test1 = test.getPropVal();
        test.setPropVal(5);
        assertNotEquals(test.getPropVal(), test1);
    }

}