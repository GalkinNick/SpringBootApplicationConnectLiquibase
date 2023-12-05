import java.util.*;

public class Company implements Comparator<Employee>{

    private String name;
    private final int MIN_INCOME = 115000;
    private final int MAX_INCOME = 140000;
    private int income;
    private ArrayList<Employee> employeesCompany = new ArrayList<>();





    public void setIncome(int value){
        this.income = value;
    }

    public Company(String Name) {
        this.name = Name;
    }

    public void hire(Employee employee) {employeesCompany.add(employee);};

    public void mounthIncome(){
        income = (int)(Math.random() * (MAX_INCOME - MIN_INCOME) + MIN_INCOME);
    }

    private void hireAll(Collection<Employee> employes) {employeesCompany.addAll(employes);};

    private void fire (Employee employee){employeesCompany.remove(employee);};


    public double getIncome(){
        return income;
    }

    public ArrayList<Employee> getArrayIncome(){
        return employeesCompany;
    }


   public ArrayList<Employee> getTopSalaryStaff(int count){
     //  Collections.sort(employeesCompany);
       return null;
   }

   public ArrayList<Employee> getLowesSalaryStaff(int count){
    /*    ArrayList<Employee> lowesSalary = new ArrayList<>();
       employeesCompany.sort(Collections.reverseOrder());
        int i = 0;
       for ( Employee emp : employeesCompany){
           lowesSalary.add(emp);
                   i++;
           if (i==count)break;
       }

        return lowesSalary;
*/ return  null;
   }


    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare((int) o1.getMonthSalary(), (int) o2.getMonthSalary());
    }
}
