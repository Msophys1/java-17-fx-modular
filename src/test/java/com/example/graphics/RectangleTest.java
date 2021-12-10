package com.example.graphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle r = new Rectangle(2.0,2.0);

    @Test
    void computeArea() {
        assertEquals(r.computeArea(),4.0 );
    }

    @Test
    void computeCirconference() {
        assertEquals(r.computeCirconference(),8.0);
    }
}