import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RectangleTest {
    @Test
    public void  computeAreaTest(){
        Rectangle rectangle = new Rectangle(2.0, 2.25);
        assertEquals(4.5, rectangle.computeArea(), 0);
        rectangle.getHeightSide().setLength(5);
        rectangle.getWidthSide().setLength(2);
        assertEquals(10, rectangle.computeArea(), 0);
        rectangle.getHeightSide().setLength(3);
        rectangle.getWidthSide().setLength(2);
        assertEquals(6, rectangle.computeArea(), 0);
        rectangle.getHeightSide().setLength(6);
        rectangle.getWidthSide().setLength(2);
        assertEquals(12, rectangle.computeArea(), 0);
    }
    @Test
    public void getAndSetTest(){
        Rectangle rectangle = new Rectangle(1, 2);
        rectangle.getHeightSide().setLength(5);
        assertEquals(5, rectangle.getHeightSide().getLength(), 0);
        rectangle.getHeightSide().setLength(10);
        assertEquals(10, rectangle.getHeightSide().getLength(), 0);
        rectangle.getWidthSide().setLength(4);
        assertEquals(4, rectangle.getWidthSide().getLength(), 0);
        rectangle.getWidthSide().setLength(8);
        assertEquals(8, rectangle.getWidthSide().getLength(), 0);
    }
}
