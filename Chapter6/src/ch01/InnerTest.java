package ch01;
//인스턴스 내부 클래스

class OutClass2 {
        private int num = 10;
        private static int sNum = 20;
        private InClass inClass;

        public OutClass2() {  // outClass 생성하면서 inClass 생성
            inClass = new InClass();
        }

        private class InClass { //보통 private로 선언
            int inNum = 100;
            static int sInNum = 500;
            void inTest() {
                System.out.println("");
                System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
                System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
                System.out.println("OutClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");
            }
        }

        public void usingClass() {
            inClass.inTest(); //내부 클래스의 메서드를 외부클래스에서 호출하여 사용
        }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass2 outClass = new OutClass2();
        outClass.usingClass();

        /*내부 클래스가 private이 아니라면 밑에와 같이 생성은 가능하다. 하지만 보통 private로 내부클래스를 선언.

        OutClass.InClass inner = outClass.new InClass();
        inner.inTest();
         */
    }
}
