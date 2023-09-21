package agh.ii.prinjava.lab01.lst01_02;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RichDadsKidTest {
    @Test
    void increaseWealthTest(){
        RichDadsKid richDadsKid = new RichDadsKid("R", "Doe", BigDecimal.valueOf(1), List.of("School Mate"));
        richDadsKid.increaseWealth();
        assertEquals(BigDecimal.valueOf(2), richDadsKid.getFortune());
    }
}