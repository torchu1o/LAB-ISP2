package ro.ulbs.paradigme.lab2.forme;

public class Square extends Form {
    private float side;

    public Square() {
        this(0,"white");
    }

    public Square(float side, String color) {
        super(color);
        this.side=side;
    }

    @Override
    public float getArea() {
        return side*side;
    }

    @Override
    public String toString() {
        return super.toString() + ", patrat cu side " + side ;
    }

}
