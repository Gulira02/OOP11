public class Rectangle {
   private int width;
   private int length;

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {

        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
    public int getArea(){
        return length*width;
    }
}
