package entities;

public class Employees {
    private Integer     id;
    private String  name;
    private Double  salary;

    public Employees(int id, String name, double salary) {
        this.id     = id;
        this.name   = name;
        this.salary = salary;
    }

    public Employees(int id, String name) {
        this.id     = id;
        this.name   = name;
    }

    public String toString() {
        return id
                + ", "
                + name
                + ", "
                + String.format("%.2f", salary);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double value) {
        salary += value;
    }

    public void increaseSalaryByPerc(double percentage) {
        salary *= (percentage/100)+1;
    }
}
