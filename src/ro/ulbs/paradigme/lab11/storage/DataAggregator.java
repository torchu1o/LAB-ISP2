package ro.ulbs.paradigme.lab11.storage;

import java.util.Observable;
import java.util.Observer;

import ro.ulbs.paradigme.lab11.dataprocessing.StepCountStrategy;
import ro.ulbs.paradigme.lab11.main.ConsoleLogger;



// TODO Implement observer for changes in data repository, implement java.util.Observer interface X
public class DataAggregator implements Observer  {

    private StepCountStrategy strategy;
    public DataAggregator(StepCountStrategy strategy) {
        this.strategy = strategy;
    }

    public String getResults() {
        return String.format("Strategy %s: stepsCount=%d", strategy.getStrategyDescription(), strategy.getTotalSteps());
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
