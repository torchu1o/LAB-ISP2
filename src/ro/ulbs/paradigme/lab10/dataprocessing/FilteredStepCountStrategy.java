package ro.ulbs.paradigme.lab10.dataprocessing;
import ro.ulbs.paradigme.lab10.storage.DataRepository;
import ro.ulbs.paradigme.lab10.storage.SensorData;

public class FilteredStepCountStrategy implements StepCountStrategy {
    private int sumFilter = 0;
    private final DataRepository dataRepository;

    public FilteredStepCountStrategy(DataRepository repository) {
        this.dataRepository = repository;
    }

    @Override
    public void consumeMessage(SensorData sample) {
        int steps = sample.getStepsCount();
        long currentTimestamp = sample.getTimestamp();


        if (steps > 0 && steps <= 1000) {

            int stepsLastMinute = dataRepository.getData().stream()
                    .filter(data -> currentTimestamp - data.getTimestamp() <= 60000).mapToInt(SensorData::getStepsCount).sum();
            if (stepsLastMinute + steps <= 1000) {
                sumFilter += steps;
            }
        }
    }
    @Override
    public int getTotalSteps() {
        return sumFilter; // Returnează suma totală filtrată.
    }

    @Override
    public String getStrategyDescription() {
        return "Filtered ";
    }
}