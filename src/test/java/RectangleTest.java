import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RectangleTest {
    @Test
    public void  computeAreaTest(){
        Rectangle rectangle = new Rectangle();
        assertEquals(10, rectangle.computeArea());

    }
}
