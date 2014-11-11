package study.refactoring.before;

/**
 * Created by sungmin on 2014. 11. 10..
 */
public class Employee {
    public Employee (int rate) {
        _rate = rate;
    }
    public int getRate() {
        return _rate;
    }
    private int _rate;
}
