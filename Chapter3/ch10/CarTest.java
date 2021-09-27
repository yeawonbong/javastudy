package ch10;

public class CarTest {
    public static void main(String[] args) {
        Car aiCar = new AICar();
        aiCar.run();    //template method
        System.out.println("\n");
        Car mCar = new ManualCar(); //순서를 조작할 수 없다.
        mCar.run();
    }
}
