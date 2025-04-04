package ro.ulbs.paradigme.lab6;
class NewIntCalculator extends ACalculator {
    public NewIntCalculator(int n) {
        this.state = n;
    }

    protected void init() {
        this.state = 0;
    }

    public NewIntCalculator add(int value) {
        this.state = (Integer) this.state + value;
        return this;
    }

    public NewIntCalculator subtract(int value) {
        this.state = (Integer) this.state - value;
        return this;
    }

    public NewIntCalculator multiply(int value) {
        this.state = (Integer) this.state * value;
        return this;
    }
}