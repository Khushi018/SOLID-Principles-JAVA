package mian.com;
abstract class Shape {
    abstract int area();
}

class Rectanglee extends Shape {
    protected int width;
    protected int height;
    
    public Rectanglee(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public int area() {
        return width * height;
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
}

class Squaree extends Shape {
    private int size;
    
    public Squaree(int size) {
        this.size = size;
    }
    
    @Override
    public int area() {
        return size * size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    public int getSize() {
        return size;
    }
}
