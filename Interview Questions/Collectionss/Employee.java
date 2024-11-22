package Collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * 1. Employee List
 * Write a Java program that creates a list of Employee objects with fields like
 * id, name, and salary.
 * Implement a method getHighSalaryEmployees() that retrieves employees with a
 * salary greater than 50,000.
 * Calculate the total salary of all employees.
 * Remove employees whose salary is less than 30,000 using an Iterator.
 * 
 */

public class Employee implements Comparable<Employee>{
    // private static int idCounter = 1;
    private int employeeId;
    private String employeeName;
    private int salary;

    Employee(int employeeid, String employeeName, int salary) {
        this.employeeId = employeeid;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override

    public int compareTo(Employee other){

        if(this.getSalary() == 0 || this.getEmployeeName() == null){
            return 0;
        }

        if(this.getSalary()!= other.getSalary()){
            return Integer.compare(this.getSalary(), other.getSalary());
        } else{
            return this.getEmployeeName().compareTo(other.getEmployeeName());
        }
        
    }

    @Override
    public String toString() {
        return "{ Employee Id: " + employeeId + " Name: " + employeeName + " Salary: " + salary + " }";
    }

}

class EmlpoyeeDriver {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Nikita", 800000));
        employees.add(new Employee(102, "Payal", 600000));
        employees.add(new Employee(103, "Bhavna", 700000));
        employees.add(new Employee(104, "Ravi", 70000));
        employees.add(new Employee(104, "Nisha", 70000));
        employees.add(new Employee(105, "Rohit", 450000));
        // System.out.println(getHighestSalary(employees));

        // int totalSalary = 0;
        // for (Employee emp : employees) {

        //     totalSalary += emp.getSalary();

        // }

        // System.out.println(totalSalary);

        // System.out.println(removeLowSalarEmployees(employees));

        Collections.sort(employees);

for(Employee emp: employees){
    System.out.println(emp);
    System.out.println();

}




    }

    public static ArrayList<Employee> getHighestSalary(ArrayList<Employee> employees) {

        ArrayList<Employee> highestSalaryEmployee = new ArrayList<>();

        for (Employee emp : employees) {
            if (emp.getSalary() > 500000) {
                highestSalaryEmployee.add(emp);
            }

        }

        return highestSalaryEmployee;

    }

    public static ArrayList<Employee> removeLowSalarEmployees(ArrayList<Employee> employees) {

        Iterator<Employee> iterator = employees.iterator();

        while (iterator.hasNext()) {

            Employee emp = iterator.next();
            if (emp.getSalary() < 500000) {
                iterator.remove();
            }
        }

        return employees;
    }

}
