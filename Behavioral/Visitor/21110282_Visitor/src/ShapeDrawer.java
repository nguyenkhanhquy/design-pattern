public class ShapeDrawer implements ShapeVisitor {

    @Override
    public void visitCircle(Circle circle) {
        // Vẽ hình tròn
        System.out.println("Vẽ hình tròn");
    }

    @Override
    public void visitSquare(Square square) {
        // Vẽ hình vuông
        System.out.println("Vẽ hình vuông");
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        // Vẽ hình tam giác
        System.out.println("Vẽ hình tam giác");
    }

}
