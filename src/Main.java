public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("Circle", 17);
        Triangle triangle = new Triangle("Triangle", 1, 2 , 3);
        Square square = new Square("Square", 8);
        Rectangle rectangle = new Rectangle("Rectangle", 6, 4);
        Car car = new Car("Car");
        Bus bus = new Bus("Bus");

        Figure [] figures = {circle, triangle, square, rectangle};
        Drawable [] drawables = {circle, triangle, square, rectangle, car, bus};

            for (int i = 0; i < drawables.length; i++) {
            drawables[i].draw();
            if (drawables[i] instanceof Figure){
                System.out.println("Name: " + ((Figure) drawables[i]).getName() + " perimeter: " + ((Figure) drawables[i]).calculatePerimeter());
            } else {
                System.out.println("Name: " + ((Transport) drawables[i]).getName());
            }
        }

    }
}