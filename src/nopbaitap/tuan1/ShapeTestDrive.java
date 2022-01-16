package nopbaitap.tuan1;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Square square = new Square();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        square.turn();
        square.play();

        circle.turn();
        circle.play();

        triangle.turn();
        triangle.play();
    }
}
