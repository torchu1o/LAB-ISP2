package ro.ulbs.paradigme.lab9;
//9.3.1 Creati o lista de 10 numere intregi aleatoare in intervalul [5..25]
//a) Calculati suma elementelor folosind java streams si afisati.
//b) Calculati valoarea maxima si minima in lista. Afisati.
//c) Parcurgeti lista si creati o alta lista prin pastrarea doar a elementelor in intervalul [10..20]. Afisati.
//d) Folosind stream transformati (mapati) lista de intregi in alta lista care sa contina valori Double. Afisati.
//e) Afisati daca in lista se gaseste valoarea 12.
import java.util.*;

public class main {
    public static void main(String[] args) {
        // lista de 10 numere aleatorii in intervalul [5, 25]
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int randomNumber = 5 + random.nextInt(21); // [0, 20] + 5 => [5, 25]
            numbers.add(randomNumber);
        }
        // calc elem cu java streams
        int sum = numbers.stream()
                .mapToInt(Integer::intValue) // Convertește Integer la int
                .sum();                     // Calculează suma
        List<Integer> filtered = numbers.stream().filter(x -> x > 10 && x<25).toList();
        List<Double> doubleList = numbers.stream().map(x -> (double) x).toList();
        int min = numbers.stream().mapToInt(Integer::intValue).min().getAsInt();
        int max = numbers.stream().mapToInt(Integer::intValue).max().getAsInt();
        Optional<Integer> primul= numbers.stream().filter(x->x==12).findFirst();
        System.out.println("min:"+min);
        System.out.println("max:"+max);
        System.out.println("Liste de numere: " + numbers);
        System.out.println("Suma elementelor: " + sum);
        System.out.println("filtrate: " + filtered);
        System.out.println("lista de double: " + doubleList);
        if(primul.isPresent()) {
            System.out.println("primul numar care se gaseste: " + primul.get());
        }
        else {
            System.out.println("nu se gaseste nici un numar");
        }
    }
}
