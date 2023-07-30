public class Rectangle {
    private double height;
    private double width;
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public double computeArea(){
        return this.height * this.width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
