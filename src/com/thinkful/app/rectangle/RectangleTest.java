package com.thinkful.app.rectangle;

import static org.junit.Assert.assertEquals;

import java.beans.Transient;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class RectangleTest {
    private Rectangle exampleRec = new Rectangle();
    private Rectangle exampleRecWParam = new Rectangle(0,0,10,5);

    @Before
    public void preTest() {}

    @Test
    public void test() {
        assertEquals(exampleRec.getHeight(), 4);
        assertEquals(exampleRecWParam.getHeight(), 10);
        assertEquals(exampleRectangleWithParam.contains(0,0), true);
        assertEquals(exampleRectangleWithParam.contains(0,20), false);
        assertEquals(exampleRectangleWithParam.contains(50,50), false);
    }

    @After
    public void postTest() {}
}