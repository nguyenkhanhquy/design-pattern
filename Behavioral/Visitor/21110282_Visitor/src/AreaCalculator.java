public class AreaCalculator implements ShapeVisitor {

    @Override
    public void visitCircle(Circle circle) {
        // Tính diện tích hình tròn
        double area = Math.PI * Math.pow(circle.getRadius(), 2);
        System.out.println("Diện tích hình tròn: " + area);
    }

    @Override
    public void visitSquare(Square square) {
        // Tính diện tích hình vuông
        double area = Math.pow(square.getSide(), 2);
        System.out.println("Diện tích hình vuông: " + area);
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        // Tính diện tích hình tam giác
        double area = 0.5 * triangle.getBase() * triangle.getHeight();
        System.out.println("Diện tích hình tam giác: " + area);
    }

}
