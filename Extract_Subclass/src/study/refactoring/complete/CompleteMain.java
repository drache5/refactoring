package study.refactoring.complete;

/**
 * Created by sungmin on 2014. 11. 11..
 */
public class CompleteMain {
    public static void main(String []args) {
        JobItem item1 = new JobItem(10, 5);
        System.out.println(item1.getTotalPrice());

        JobItem item2 = new LaborItem(5, new Employee(15));
        System.out.println(item2.getTotalPrice());

    }
}
