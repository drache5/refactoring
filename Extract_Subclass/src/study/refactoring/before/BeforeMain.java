package study.refactoring.before;

/**
 * Created by sungmin on 2014. 11. 11..
 */
public class BeforeMain {
    public static void main(String []args) {
        JobItem item1 = new JobItem(10, 5, false, new Employee(15));
        System.out.println(item1.getTotalPrice());

        JobItem item2 = new JobItem(10, 5, true, new Employee(15));
        System.out.println(item2.getTotalPrice());
    }
}
