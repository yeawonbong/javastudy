package ch16;

public class EmployeeTest {

    public static void main(String[] args) {

        System.out.println(Employee.getSerialNum()); // 이렇게 클래스 생성 이전에 클래스로 참조해서 쓸 수 있다.

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");

        System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId());

    }
}
