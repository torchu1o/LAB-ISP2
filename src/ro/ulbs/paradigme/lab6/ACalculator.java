package ro.ulbs.paradigme.lab6;

// Clasa abstracta ACalculator
public abstract class ACalculator {
    protected Object state;

    public Object result() {
        return state;
    }

    public ACalculator clear() {
        this.init();
        return this;
    }

    protected abstract ACalculator init();
}
