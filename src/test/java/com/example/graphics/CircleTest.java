package com.example.graphics;

import com.example.calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle c = new Circle(2.0,2.0,1.0);
    double radius = 1;
    @Test
    void computeArea() {
        assertEquals(c.computeArea(),Math.PI*this.radius*this.radius);
    }

    @Test
    void computeCirconference() {
        assertEquals(c.computeCirconference(),2*Math.PI*this.radius*this.radius);
    }
}