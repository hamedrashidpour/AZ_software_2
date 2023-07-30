public class Rectangle {
    private int height;
    private int width;
    public Rectangle() {
    }
    public long computeArea(){
        return (long) this.height * this.width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
