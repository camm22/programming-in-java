package agh.ii.prinjava.lab04.exc04_01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairTest {

    Pair<Integer, String> pairOfIntStr;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testClonable()  {
        Pair<Double, String> p1 = new Pair<>(33.2, "hehe");
        try{
            //Pair<Double, String> p2 = (Pair<Double, String>) p1.clone();
            Pair<?,?> p2 = (Pair<?,?>) p1.clone();
            assertEquals(p1, p2);
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}