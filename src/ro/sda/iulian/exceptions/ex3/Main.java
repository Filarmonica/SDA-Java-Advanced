package ro.sda.iulian.exceptions.ex3;

public class Main {
    public static void main(String[] args) {
        int salary = 1500;

        Employee employee1 = new Employee("Ion", "janitor");
        try {
            employee1.setSalary(salary);
        } catch (SalaryTooLowException s) {
            System.out.println("Please increase salary!");
        } catch (SalaryTooBigException s1) {
            System.out.println("Please decrease salary!");
        }
    }
}
