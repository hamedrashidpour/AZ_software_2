import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


import org.junit.Test;

public class SquareTest {
    @Test
    public void SquareSideTest(){
        Square square = new Square();
        square.setSide(5.0);
        assertEquals(5.0, square.getSide(), 0);
        assertEquals(4.0, new Square(4.0), 0);
    }
}
