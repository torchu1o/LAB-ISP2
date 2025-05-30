package ro.ulbs.paradigme.lab11.storage;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class DataRepository extends Observable {
    List<ISensorData> records = new ArrayList<>();
    private static DataRepository instance;

    private DataRepository() {}
    public static DataRepository getInstance() {
        if (instance == null) {
            instance = new DataRepository();
        }
        return instance;
    }
    public void addData(ISensorData dataRecord) {
        // TODO notify observers -  mark as changed, then call inherited notifyObservers(dataRecord)
        setChanged();
        notifyObservers(dataRecord);
        clearChanged();
        records.add(dataRecord);
    }
}


