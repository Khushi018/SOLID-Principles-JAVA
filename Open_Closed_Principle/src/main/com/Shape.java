package main.com;
// Example violating OCP
class Shape {
    public void draw() {
        // Drawing logic
    }
}

class Circlee extends Shape {
    // Violation of OCP: Adding new shapes requires modification here
}

class Square extends Shape {
    // Violation of OCP: Adding new shapes requires modification here
}
