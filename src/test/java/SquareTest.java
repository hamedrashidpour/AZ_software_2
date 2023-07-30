import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class SquareTest {
    @Test
    public void SquareSideTest(){
        Square square = new Square();
        assertEquals(5.0, square.side = 5.0, 0);
    }
}
