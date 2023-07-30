import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RectangleTest {
    @Test
    public void  computeAreaTest(){
        Rectangle rectangle = new Rectangle(2.0, 2.25);
        assertEquals(4.5, rectangle.computeArea(), 0);
        rectangle.setHeight(5);
        rectangle.setWidth(2);
        assertEquals(10, rectangle.computeArea(), 0);
        rectangle.setHeight(3);
        rectangle.setWidth(2);
        assertEquals(6, rectangle.computeArea(), 0);
        rectangle.setHeight(6);
        rectangle.setWidth(2);
        assertEquals(12, rectangle.computeArea(), 0);
    }
    @Test
    public void getAndSetTest(){
        Rectangle rectangle = new Rectangle(1, 2);
        rectangle.setHeight(5);
        assertEquals(5, rectangle.getHeight(), 0);
        rectangle.setHeight(10);
        assertEquals(10, rectangle.getHeight(), 0);
        rectangle.setWidth(4);
        assertEquals(4, rectangle.getWidth(), 0);
        rectangle.setWidth(8);
        assertEquals(8, rectangle.getWidth(), 0);
    }
}
