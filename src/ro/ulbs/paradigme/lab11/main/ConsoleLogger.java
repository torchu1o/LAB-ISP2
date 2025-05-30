package ro.ulbs.paradigme.lab11.main;


import java.util.Observable;
import java.util.Observer;

// TODO make this class Observer, by implementing java.util.Observer interface
public class ConsoleLogger implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("am primit obiectul" + arg);
    }

    // TODO upon each notification, print to console

}
