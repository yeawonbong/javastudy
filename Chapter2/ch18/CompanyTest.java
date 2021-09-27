package ch18;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {
        Company company1 = Company.getInstance(); // static이기 때문에 외부에서 class로 접근 가능한 것
        Company company2 = Company.getInstance();
        //Company error = new Company(); //오류 - 외부에서 생성 불가

        System.out.println(company1);
        System.out.println(company2);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
    }
}
