import java.util.ArrayList;

public class TopManager implements  Employee{

    private final double FIXED_SALARY = 50000;
    private final double BONUS = 1.50;

    private final double MAX_SALARY = 10000000;
    private int sum = 0;

    private double mounthIncome;




    public TopManager(int Sum, double MounthIncome){
        sum = Sum;
        mounthIncome = MounthIncome;
    }



    @Override
    public int getMonthSalary() {
       if (sum > MAX_SALARY) {
            return (int) ((int) FIXED_SALARY + mounthIncome * BONUS);
        }
        return 0;
    }
}
