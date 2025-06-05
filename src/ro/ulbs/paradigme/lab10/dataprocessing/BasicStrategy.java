package ro.ulbs.paradigme.lab10.dataprocessing;
import ro.ulbs.paradigme.lab10.storage.SensorData;
public class BasicStrategy implements StepCountStrategy {
private int sum = 0;
    @Override
    public void consumeMessage(SensorData sample) {
        sum += sample.getStepsCount(); //sumeaza orice val primita
    }

    @Override
    public int getTotalSteps() {
        return sum;
    } //returneaza totalu

    @Override
    public String getStrategyDescription() {
        return "basic";
    }
}
