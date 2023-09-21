package agh.ii.prinjava.lab01.lst01_03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void Rectangle2X5PerimeterEaqual14(){
        Rectangle r = new Rectangle(2, 5);
        assertEquals(14, r.perimeter());
    }
    @Test
    void Rectangle2X5AreaEqual10(){
        Rectangle r = new Rectangle(2, 5);
        assertEquals(10, r.area());
    }
}