package ch10;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }
    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public void washCar() {}    //Hook Method

    final public void run() {     //template method - 시나리오를 정의해준다 (순서 등의 흐름) 재정의 안되게 final
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }
}
