public class Main {
    public static void main(String[] args){

        Company ManAndWomen = new Company("ManAndWomen");
        int sum = 0;

        for (int i = 0; i < 80; i++){
        ManAndWomen.mounthIncome(); // генерация дохода
        Manager manager  = new Manager(ManAndWomen.getIncome());
        sum += (int) ManAndWomen.getIncome(); // общий доход компании
        System.out.println("Зарплата менеджера = " + manager.getMonthSalary() + " руб.");
        ManAndWomen.hire(manager);

        }



        for (int i = 0; i < 180; i++){
        Operator operator = new Operator();
        System.out.println("Зарплата опреатора = " + operator.getMonthSalary() + " руб.");
        ManAndWomen.hire(operator);
        }


        for (int j = 0; j <= 10; j++) {
            ManAndWomen.mounthIncome();
            TopManager Bob = new TopManager(sum, ManAndWomen.getIncome());
            System.out.println("Зарплата топ менеджера = " + (int)Bob.getMonthSalary() + " руб.");
        }

        System.out.println("Колличество сотрудников " + ManAndWomen.getArrayIncome().size());

        System.out.println("Топ самых высоких зарплат " + ManAndWomen.getTopSalaryStaff(15));
        for (var kk : ManAndWomen.getTopSalaryStaff(14)){
            System.out.println(kk.getMonthSalary());
        }

        System.out.println("Топ самых низких зарплат " + ManAndWomen.getLowesSalaryStaff(30));
        for (var kk : ManAndWomen.getLowesSalaryStaff(30)){
            System.out.println(kk.getMonthSalary());
        }

        for (int f = 0; f < ManAndWomen.getArrayIncome().size(); f++) {
            ManAndWomen.fire(ManAndWomen.getArrayIncome().get(f));
        }
        System.out.println("Колличество сотрудников " + ManAndWomen.getArrayIncome().size());

        System.out.println("Топ самых высоких зарплат " + ManAndWomen.getTopSalaryStaff(15));
        for (var kk : ManAndWomen.getTopSalaryStaff(14)){
            System.out.println(kk.getMonthSalary());
        }

        System.out.println("Топ самых низких зарплат" + ManAndWomen.getLowesSalaryStaff(30));
        for (var kk : ManAndWomen.getLowesSalaryStaff(30)){
            System.out.println(kk.getMonthSalary());
        }




    }
}
