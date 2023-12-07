public class Operator implements  Employee{
    private final int FIXED_SALARY = 46800;

    @Override
    public int getMonthSalary() {
        return FIXED_SALARY;
    }
}
