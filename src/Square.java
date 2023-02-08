public class Square extends Figure{
    private int a;


    @Override
    public int calculatePerimeter() {
        return (4*a);
    }

    public Square(String name, int a) {
        super(name);
        this.a = a;
    }

    public int getA() {
        return a;
    }

    @Override
    public void draw() {
        System.out.println("⬜");

    }
}
