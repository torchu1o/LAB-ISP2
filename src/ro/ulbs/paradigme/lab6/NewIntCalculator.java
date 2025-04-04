package ro.ulbs.paradigme.lab6;
class NewIntCalculator extends ACalculator {
    public NewIntCalculator(int n) {
        this.state = n;
    }

    protected NewIntCalculator init() {
        this.state = 0;
        return this;     //am facut metoda init inlantuibila inlocuind tipul cu numele clasei si punand return this la final
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