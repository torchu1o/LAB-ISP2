package ro.ulbs.paradigme.lab2.forme;

public class Form {
    private static int counter;
    static {
        counter = 0;
    }
    private String color;

    public Form() {
        this.color = "white";
    }

    public Form(String color) {
        this.color = color;
    }

    public float getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "forma are culoarea " + color;
    }
}
