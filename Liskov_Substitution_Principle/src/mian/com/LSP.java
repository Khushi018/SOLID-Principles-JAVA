
package mian.com;
class Rectangle {
    protected int width;
    protected int height;
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public int area() {
        return width * height;
    }
}

class Square extends Rectangle {
    public Square(int size) {
        super(size, size);
    }
    
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }
    
    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}
public class LSP {
	public static void main(String[] args) {
		Rectangle rectangle = new Square(5);
		rectangle.setWidth(10); // This will change the width to 10, but height remains 5
		System.out.println(rectangle.area()); // Expected: 50, Actual: 100

	}
}