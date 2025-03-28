package ro.ulbs.paradigme.lab5;

import java.io.*;
import java.util.Scanner; // Import the Scanner class to read text files

public class Application {
    public static void main(String[] args) {
        try {
            File obFile = new File("input.txt");
            Scanner obiectScanner = new Scanner(obFile);
            File obFileOut= new File("output.txt");
           try( BufferedWriter writer = new BufferedWriter(new FileWriter(obFileOut))) {
               while (obiectScanner.hasNextLine()) {
                   String data = obiectScanner.nextLine();
                   //bagam in variabila words ce returneaza metoda split
                   String[] words = data.split("\\.");// daca pun \\ inainte de un caracter il trateaza exact ca pe un caracter si nu are semnificatie
                   for (String s : words) //trece prin toate cuvintele si da o variabila s pt fiecare
                   {
                       System.out.println(s);
                       writer.write(s + "\n");
                   }

               }
           }
            obiectScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nu-l gasim pe input asta...");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}