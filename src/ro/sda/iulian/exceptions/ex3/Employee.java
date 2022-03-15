package ro.sda.iulian.exceptions.ex3;

public class Employee {
    private String name;
    private int salary;
    private String role;
    private  static final int MIN_SALARY=1800;
    private static final int MAX_SALARY=4000;
    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) throws SalaryTooBigException, SalaryTooLowException {
        if(salary<MIN_SALARY){
            throw new SalaryTooLowException(" "+salary);
        }
        if(salary>MAX_SALARY){
            throw new SalaryTooBigException(Integer.toString(salary));
        }
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", role='" + role + '\'' +
                '}';
    }
}
