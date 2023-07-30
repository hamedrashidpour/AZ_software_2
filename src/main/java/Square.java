public class Square implements Area{
    private final Side side;

    public Square(double side) {
        this.side =new Side(side);
    }


    public Side getSide() {
        return side;
    }
    @Override
    public double computeArea(){
        return this.side.getLength() * this.side.getLength();
    }

}
