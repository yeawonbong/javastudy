package ch01;
//익명 내부 클래스

class Outer3 {

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {
        int num = 10;

        return new Runnable() { // 바로 return으로 클래스를 Runnable type으로 반환해준다. 이름 없이. 익명 클래스
            int localNum = 1000;
            @Override
            public void run() {

                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);

                System.out.println("outNum = " + outNum + " (외부 클래스 인스턴스 변수)");
                System.out.println("Outter.sNum = " + Outer2.sNum + " (외부 클래스 인스턴스 변수)");
            }
        };
    }

    Runnable runnable = new Runnable() { // Outer3의 인스턴스 변수
        @Override
        public void run() {
            System.out.println("Runnable class");
        }
    };
}

public class AnonymousInnerTest {
    public static void main(String[] args) {

        Outer3 out = new Outer3();
        Runnable runner = out.getRunnable(100);

        runner.run();
        out.runnable.run(); //instance 변수의 메서드를 호출
    }
}
