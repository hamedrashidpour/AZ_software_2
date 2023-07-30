import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RectangleTest {
    @Test
    public void  computeAreaTest(){
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5);
        rectangle.setWidth(2);
        assertEquals(10, rectangle.computeArea());
        rectangle.setHeight(3);
        rectangle.setWidth(2);
        assertEquals(6, rectangle.computeArea());
        rectangle.setHeight(6);
        rectangle.setWidth(2);
        assertEquals(12, rectangle.computeArea());
    }
    @Test
    public void getAndSetTest(){
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5);
        assertEquals(5, rectangle.getHeight());
        rectangle.setHeight(10);
        assertEquals(10, rectangle.getHeight());
        rectangle.setWidth(4);
        assertEquals(4, rectangle.getWidth());
        rectangle.setWidth(8);
        assertEquals(8, rectangle.getWidth());
    }
}
