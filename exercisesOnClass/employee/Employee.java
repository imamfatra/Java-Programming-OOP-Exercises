package exercisesOnClass.employee;

public class Employee {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private int id;
    private String firsName;
    private String lastName;
    private  int salary;

    Employee(int id, String firsName, String lastName, int salary) {
        setId(id);
        setFirsName(firsName);
        setLastName(lastName);
        setSalary(salary);
    }

    public String getName() {
        return getFirsName() + " " + getLastName();
    }
    public int getAnnualSalary() {
        var annualSalary = getSalary() * 12;
        return annualSalary;
    }

    public int raiseSalary(int percent) {
        int newSalary = (getSalary() * percent /100) + getSalary();
        setSalary(newSalary);
        return newSalary;
    }

    public String toString() {
        String employee = String.format("Employee[id=%d,name=%s %s,salary=%d]", getId(), getFirsName(), getLastName(), getSalary());
        return employee;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1);  // toString();

        // Test Setters and Getters
        e1.setSalary(999);
        System.out.println(e1);  // toString();
        System.out.println("id is: " + e1.getId());
        System.out.println("firstname is: " + e1.getFirsName());
        System.out.println("lastname is: " + e1.getLastName());
        System.out.println("salary is: " + e1.getSalary());

        System.out.println("name is: " + e1.getName());
        System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method

        // Test raiseSalary()
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);
    }
}
