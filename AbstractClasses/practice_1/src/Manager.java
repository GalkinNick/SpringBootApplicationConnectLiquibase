public class Manager implements  Employee {

    private final double FIXED_SALARY = 50000;
    private final double BONUS = 0.05;
    private double mounthIncome;
    private Company company;


 /*   public Manager(Company Company ){
        company = Company;
        mounthIncome = (int) (FIXED_SALARY + get)
    }*/

    public Manager(double MounthImcome){
        mounthIncome = MounthImcome;
    }
   /* private int moneyCompany(){

            return  (int)(Math.random() * (MAX_INCOME - MIN_INCOME) + MIN_INCOME);

    }*/
    @Override
    public double getMonthSalary() {
        return FIXED_SALARY + mounthIncome * BONUS;
    }
}
