import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class SquareTest {
    @Test
    public void SquareSideTest(){
        Square square = new Square(3.0);
        square.getSide().setLength(5.0);
        assertEquals(5.0, square.getSide().getLength(), 0);
        assertEquals(4.0, new Square(4.0).getSide().getLength(), 0);
    }

    @Test
    public void computeAreaTest(){
        Square square = new Square(5);
        assertEquals(25.0, square.computeArea(), 0);
    }
}
