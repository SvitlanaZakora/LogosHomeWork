public class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
        this.length = 10;
        this.width = 25;

    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int getLength(){
        return this.length;
    }
    public int getWidth(){
        return this.width;
    }
    public int square(){
        return this.length*this.width;
    }
    public int perimeter(){
        return (this.length*2)+(this.width*2);
    }

}
