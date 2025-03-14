package ro.ulbs.paradigme.lab3;

import ro.ulbs.paradigme.lab3.StringRandomizer;

import java.util.Random;

public class PasswordMaker {
    private static final int MAGIC_NUMBER = 5 + new Random().nextInt(6); // MAGIC_NUMBER între 5 și 10
    private final String magicString;
    private static PasswordMaker instance;  // Variabila statică pentru instanță
    private static int getInstanceCallCount = 0; // Contor pentru accesarea metodei getInstance()

    // Constructor privat pentru a preveni instanțierea din afară
    private PasswordMaker(String name) {
        // Generăm magicString aleatoriu, cu o lungime de minim 20 de caractere
        this.magicString = StringRandomizer.generateRandomString(20);
    }

    // Metoda getInstance() pentru a obține instanța unică
    public static PasswordMaker getInstance(String name) {
        // Incrementăm contorul de accesări
        getInstanceCallCount++;

        // Dacă instanța nu există, o creăm
        if (instance == null) {
            instance = new PasswordMaker(name);
        }
        return instance;
    }

    // Metoda getPassword() care generează parola
    public String getPassword() {
        Random random = new Random();

        // Generăm un șir aleatoriu de lungime MAGIC_NUMBER
        String randomPart = StringRandomizer.generateRandomString(MAGIC_NUMBER);

        // Extragem 10 caractere random din magicString
        StringBuilder magicPart = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            magicPart.append(magicString.charAt(random.nextInt(magicString.length())));
        }

        int randomInt = random.nextInt(51);

        // Concatenăm toate componentele pentru a forma parola
        return randomPart + magicPart.toString() + randomInt;
    }

    // Metoda pentru a obține contorul de accesări la getInstance()
    public static int getGetInstanceCallCount() {
        return getInstanceCallCount;
    }
}