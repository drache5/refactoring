package study.refactoring.complete;

/**
 * Created by sungmin on 2014. 11. 10..
 */
public class JobItem {
    private int _unitPrice;
    private int _quantity;

    public JobItem(int unitPrice, int quantity) {
        _unitPrice = unitPrice;
        _quantity = quantity;
    }

    public int getTotalPrice() {
        return getUnitPrice() * getQuantity();
    }

    public int getUnitPrice() {
        return _unitPrice;
    }

    public int getQuantity() {
        return _quantity;
    }

}
