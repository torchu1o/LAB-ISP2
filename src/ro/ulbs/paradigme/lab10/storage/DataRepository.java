package ro.ulbs.paradigme.lab10.storage;


import java.util.ArrayList;
import java.util.List;


public class DataRepository {
    List <SensorData> records = new ArrayList<>();
    private static DataRepository instance = new DataRepository();
    private DataRepository(){

    }
    public static DataRepository getInstance() {
        return instance;
    }

    public void addData(SensorData dataRecord){
        // TODO store data (e.g. in a List)
        records.add(dataRecord);
    }
    public void getData(SensorData dataRecord){
        return basetimestamp;
    }
 // TODO implement a method to get the stored data (needed by the strategies)
    public List<SensorData> getRecords() {
        return records;
    }
}


