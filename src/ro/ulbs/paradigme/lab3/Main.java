package ro.ulbs.paradigme.lab3;

import ro.ulbs.paradigme.lab3.PasswordMaker;

public class Main {
    public static void main(String[] args) {
        // Creăm instanțe folosind Singleton-ul
        PasswordMaker passwordMaker1 = PasswordMaker.getInstance("JohnDoe");
        PasswordMaker passwordMaker2 = PasswordMaker.getInstance("JaneDoe");

        // Generăm și afișăm parolele
        System.out.println("Parola 1: " + passwordMaker1.getPassword());
        System.out.println("Parola 2: " + passwordMaker2.getPassword());

        // Afișăm numărul de accesări ale metodei getInstance()
        System.out.println("Metoda getInstance() a fost accesată de " + PasswordMaker.getGetInstanceCallCount() + " ori.");
    }
}

