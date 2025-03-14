package ro.ulbs.paradigme.lab2.forme;

public class Triangle extends Form {
    private float height, base;

    public Triangle() {
        this(0, 0, "white");
    }

    public Triangle(float height, float base, String color) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public float getArea() {
        return 0.5f * base * height;
    }

    @Override
    public String toString() {
        return super.toString() + ", triunghi cu inaltimea " + height + " si baza " + base;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Triangle triangle = (Triangle) obj;
        return Float.compare(triangle.height, height) == 0 &&
                Float.compare(triangle.base, base) == 0 &&
                this.toString().equals(triangle.toString());
    }
}