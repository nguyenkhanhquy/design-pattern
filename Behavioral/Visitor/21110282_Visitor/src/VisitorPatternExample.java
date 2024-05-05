public class VisitorPatternExample {

    public static void main(String[] args) {
        // Tạo các hình
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Triangle triangle = new Triangle(3, 6);

        // Tính diện tích và vẽ hình
        AreaCalculator areaCalculator = new AreaCalculator();
        ShapeDrawer shapeDrawer = new ShapeDrawer();

        circle.accept(areaCalculator);
        square.accept(areaCalculator);
        triangle.accept(areaCalculator);

        circle.accept(shapeDrawer);
        square.accept(shapeDrawer);
        triangle.accept(shapeDrawer);
    }

}
