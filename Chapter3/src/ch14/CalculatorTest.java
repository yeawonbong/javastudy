package ch14;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        CompleteCalc calc = new CompleteCalc();
        System.out.println(num1 + "+" + num2 + "=" + calc.add(num1, num2));
        System.out.println(num1 + "-" + num2 + "=" + calc.substract(num1, num2));
        System.out.println(num1 + "*" + num2 + "=" + calc.times(num1, num2));
        System.out.println(num1 + "/" + num2 + "=" + calc.divide(num1, num2));

        calc.description();  //default method
        int[] arr = {1,2,3,4,5};
        System.out.println(Calc.total(arr)); //static 메서드이기 때문에 직접 인터페이스 이름으로 호출
    }
}
