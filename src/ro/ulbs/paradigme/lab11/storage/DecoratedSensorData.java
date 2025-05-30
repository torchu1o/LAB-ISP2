package ro.ulbs.paradigme.lab11.storage;

// TODO implement decorator for ISensorData objects. Make sure toString() returning different value than decorated object toString()
public class DecoratedSensorData implements ISensorData  {
    ISensorData decoratedSensorData;
    @Override
    public int getStepsCount() {
        return 0;
    }
public DecoratedSensorData(ISensorData decoratedSensorData){
        this.decoratedSensorData = decoratedSensorData;
}
    @Override
    public long getTimestamp() {
        return 0;
    }

}
