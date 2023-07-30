public class Rectangle implements Area {
    private final Side height;
    private final Side width;

    public Rectangle(double height, double width) {
        this.height = new Side(height);
        this.width = new Side(width);
    }
    @Override
    public double computeArea(){
        return this.height.getLength() * this.width.getLength();
    }

    public Side getHeightSide() {
        return height;
    }

    public Side getWidthSide() {
        return width;
    }
}
