package ro.ulbs.paradigme.lab6;

class DoubleCalculator extends ACalculator {
    public DoubleCalculator(double n) {
        this.state = n;
    }

    protected DoubleCalculator init() {
        this.state = 0.0;
        return this;
    }

    public DoubleCalculator add(double value) {
        this.state = (Double) this.state + value;
        return this;
    }

    public DoubleCalculator subtract(double value) {
        this.state = (Double) this.state - value;
        return this;
    }

    public DoubleCalculator multiply(double value) {
        this.state = (Double) this.state * value;
        return this;
    }
}
