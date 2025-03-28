package ro.ulbs.paradigme.lab4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Student> studenti = genereazaStudenti(10);

        System.out.println("\nSortare alfabetică pe grupe:");
        studenti.stream().sorted(new ComparatorNume()).forEach(System.out::println);

        System.out.println("\nSortare descrescatoare a mediilor pentru integraliști:");
        studenti.stream().filter(s -> s.restante() == 0).sorted(new ComparatorMedie()).forEach(System.out::println);

        System.out.println("\nSortare crescătoare a numărului de restanțe pentru restanțieri:");
        studenti.stream().filter(s -> s.restante() > 0).sorted(new ComparatorGrupa()).forEach(System.out::println);
    }

    public static List<Student> genereazaStudenti(int n) {
        String[] numeLista = {"Popescu Ana", "Ionescu Mihai", "Dumitru Andrei", "Georgescu Maria", "Vasilescu Ioana"};
        List<Student> studenti = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            String nume = numeLista[rand.nextInt(numeLista.length)];
            int grupa = rand.nextInt(5) + 1;
            List<Integer> note = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                note.add(rand.nextInt(7) + 4);
            }
            studenti.add(new Student(nume, grupa, note));
        }
        return studenti;
    }
}


