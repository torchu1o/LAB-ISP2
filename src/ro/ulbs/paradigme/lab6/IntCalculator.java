package ro.ulbs.paradigme.lab6;

public class IntCalculator {
   private int state=0;
   public IntCalculator(int n) {
       this.state=n;
   }
    public void clear(int state) {
       this.state=0;
    }
    public int result() {
    return state;
    }
public IntCalculator add(int state) {
       this.state+=state;
       return this;
}
    public IntCalculator subtract(int state) {
        this.state-=state;
        return this;
    }
    public IntCalculator multiply(int state) {
        this.state*=state;
        return this;
        //pentru ca o metoda sa fie inlantuibila trebuie sa fie de tipul clasei si sa returneze DOAR parametrul this
    }
}
