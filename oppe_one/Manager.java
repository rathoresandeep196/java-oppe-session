import java.util.*;

abstract class Employee {
    private String name;
    private double salary;

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public abstract void printBonus();
}

public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    public void printBonus() {
        System.out.println(getName() + " : " + getSalary() * 0.1);
    }
}

public class Director extends Employee {
    public Director(String name, double salary) {
        super(name, salary);
    }

    public void printBonus() {
        System.out.println(getName() + " : " + getSalary() * 0.15);
    }
}

public class Organisation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] eArr = new Employee[2];
        eArr[0] = new Manager(sc.nextLine(), sc.nextDouble());
        eArr[1] = new Director(sc.nextLine(), sc.nextDouble());
        eArr[0].printBonus();
        eArr[1].printBonus();
        sc.close();
    }
}