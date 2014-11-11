package study.refactoring.complete;

/**
 * Created by sungmin on 2014. 11. 10..
 */
public class LaborItem extends JobItem {

    private Employee _employee;

    public LaborItem(int quantity, Employee employee) {
        super(0, quantity);
        _employee = employee;
    }

    @Override
    public int getUnitPrice() {
        return _employee.getRate();
    }

    public Employee getEmployee() {
        return _employee;
    }
}
