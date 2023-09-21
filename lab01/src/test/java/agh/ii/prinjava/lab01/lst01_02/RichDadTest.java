package agh.ii.prinjava.lab01.lst01_02;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RichDadTest {
    @Test
    void increaseWealthTest(){
        RichDad richDad = new RichDad("R", "Doe", BigDecimal.valueOf(1), List.of("School Mate"));
        richDad.increaseWealth();
        assertEquals(BigDecimal.valueOf(11), richDad.getFortune());
    }
}