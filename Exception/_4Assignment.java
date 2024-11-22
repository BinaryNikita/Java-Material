package Exception;

import java.util.Scanner;

/*20 Write a program in java. A class Teacher contains two fields Name and Qualification. 
Extends the class to department it contains dept. no and Dept Name. An interface named
as college it contains one field name of the college. Using the above classes
and interface get the appropriate information and display it. Ask Deptno from 
user if deptno is not 10 or 20 or 30 throw NoDeptartmentException (userdefined 
exception) and with appropriate message terminate program .
else call display method if all data is valid */
class NoDeptartmentException extends RuntimeException {
    String msg;

    NoDeptartmentException(String msg) {
        super(msg);
    }
}

interface College {
    final String college = "SGSITS";

    static void showCollege() {
        System.out.println("College name is: " + college);
    }

}

class Department {
    int departmentNumber;
    String departmentName;

    void showDepartmentInfo() {
        College.showCollege();
        System.out.println("Department Number is: " + departmentNumber);
        System.out.println("Department Name is: " + departmentName);
    }

    Department(int departmentNumber, String departmentName) {
        this.departmentNumber = departmentNumber;
        this.departmentName = departmentName;
    }

}

class Teacher extends Department implements College {

    Teacher(int departmentNumber, String departmentName) {
        super(departmentNumber, departmentName);
    }

    String name;

    void showData(String name) {
        super.showDepartmentInfo();
        this.name = name;
        System.out.println("Teacher name is: " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name is: ");
        String name = sc.nextLine();
        System.out.println("Enter Department Number: ");
        int dNum = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Department name: ");
        String dName = sc.nextLine();

        if (dNum == 10 || dNum == 20 || dNum == 30) {
            Teacher ob = new Teacher(dNum, dName);
            ob.showData(name);
        } else {
            throw new NoDeptartmentException("No such Department is found");
        }

    }

}
