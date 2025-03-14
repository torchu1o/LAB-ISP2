package ro.ulbs.paradigme.lab2.forme;

public class Form {
    private static int counter;
    private String color;

    static {
        counter = 0;
    }

    public Form() {
        this.color = "white";
        counter++;
    }

    public Form(String color) {
        this.color = color;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public float getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Forma are culoarea " + color;
    }

    public static void main(String[] args) {
        Form form1 = new Form();
        Form form2 = new Form("red");
        Form form3 = new Form("blue");

        // Afișăm numărul de instanțe create
        System.out.println("Numărul de instanțe create: " + Form.getCounter());
    }
}
