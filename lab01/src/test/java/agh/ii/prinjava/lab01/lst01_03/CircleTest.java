package agh.ii.prinjava.lab01.lst01_03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void circle5PerimeterEaqual10pi(){
        Circle c = new Circle(5);
        assertEquals(10*Math.PI, c.perimeter());
    }
    @Test
    void circle5AreaEaqual25pi(){
        Circle c = new Circle(5);
        assertEquals(25*Math.PI, c.area());
    }
}