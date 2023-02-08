public class Rectangle extends Figure{
    private int a, b;


    @Override
    public int calculatePerimeter() {
        return (2*(a + b));
    }

    public Rectangle(String name, int a, int b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDFE9");

    }
}
