package ch14;

public interface Calc {
    double PI = 3.14;
    int ERROR = -99999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description() { //default method - 인터페이스에 대한 설명을 만들어보겠음
        System.out.println("정수의 사칙연산을 제공합니다.");
        myMethod(); //private method 호출
    }
    static int total(int[] arr) { //static method
        int total = 0;
        for(int num : arr) {
            total += num;
        }
        return total;
    }
    private void myMethod(){
        System.out.println("myMethod");
    }
    private static void myStaticMethod(){
        System.out.println("myStaticMethod");
    }
}
