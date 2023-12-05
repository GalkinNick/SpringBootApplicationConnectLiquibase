public class Operator implements  Employee{
    private final double FIXED_SALARY = 50000;
    @Override
    public double getMonthSalary() {
        return FIXED_SALARY;
    }
}
