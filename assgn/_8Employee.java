package assgn;
class Employee extends PersonClass {

    int EmplyId;
    private void showEmployeeId(int EmplyId){
        System.out.println("Employee Id is " + EmplyId);

    }
    public void godata( int EmplyId){
        showEmployeeId(EmplyId);
    }
}

class EmployeeDriver {
    public static void main(String[] args) {
        PersonClass ob = new PersonClass();
        Employee ob2 = new Employee();
        String eName = ob.name;
        eName = "Nikita Vishnoi";
        int eAge = ob.age;
        eAge = 21;
        int eId = ob2.EmplyId;
        eId = 1001;
        ob.showData(eName, eAge);
        ob2.godata(eId);
    }
}
