package ro.ulbs.paradigme.lab4;

import java.util.List;

public class Student {
    String nume;
    int grupa;
    List<Integer> note;

    public Student(String nume, int grupa, List<Integer> note) {
        this.nume = nume;
        this.grupa = grupa;
        this.note = note;
    }

    public double medie() {
        return note.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public int restante() {
        return (int) note.stream().filter(n -> n < 5).count();
    }

    @Override
    public String toString() {
        return String.format("%s (Grupa %d) - Note: %s - Medie: %.2f - Restante: %d",
                nume, grupa, note, medie(), restante());
    }
}


