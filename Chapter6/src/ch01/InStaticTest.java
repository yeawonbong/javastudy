package ch01;
// 정적 내부 클래스

class OutClass {
    private int num = 10;
    private static int sNum = 20;

    static class InStaticClass {
        int iNum = 100;
        static int sInNum = 200;
        void inTest() {
            System.out.println("OutClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("OutClass sInNum = " + sInNum + "(내부 클래스의 인스턴스 변수)");
        }
        static void sTest() {
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("OutClass sInNum = " + sInNum + "(내부 클래스의 인스턴스 변수)");
        }
    }
}

public class InStaticTest {
    public static void main(String[] args) {
        OutClass.InStaticClass sInClass = new OutClass.InStaticClass(); //static class를 outClass 생성과 상관없이 생성할 수 있음
        sInClass.inTest();
        OutClass.InStaticClass.sTest(); //생성 없이 static 메서드는 호출 가능
    }
}
