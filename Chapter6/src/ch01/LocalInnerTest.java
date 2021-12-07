package ch01;
//지역 내부 클래스 - 메서드 내부에 클래스

class Outer2 {

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(/*final*/int i) { // (자바 인터페이스, 클래스를 스레드화 할 때 사용됨.)
        /*final*/int num = 10; // precompile 단계에서 final을 붙여 상수화 시켜준다.
        class MyRunnable implements Runnable { //지역 내부 클래스

            int localNum = 1000;
            @Override
            public void run() {
                //i = 50;     // err: i와 num은 final이라 constant memory에 있다. (스택이 아니라.) 그래서 상수화되어 바꿀 수 없다.
                //num =20;    // err: 메서드는 실행 후 모두 없어지기 때문에. 하지만 이 클래스는 Runnable로 호출될 수 있으니까.

                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);

                System.out.println("outNum = " + outNum + " (외부 클래스 인스턴스 변수)");
                System.out.println("Outter.sNum = " + Outer2.sNum + " (외부 클래스 인스턴스 변수)");
            }
        }
        return new MyRunnable(); // 내부 클래스를 생성해서 반환해주는 메서드인 것.
    }
}

public class LocalInnerTest {
    public static void main(String[] args) {

        Outer2 out = new Outer2();
        Runnable runner = out.getRunnable(100); // 호출된 후 이 메서드는 끝이난다.
        runner.run();
    }
}
