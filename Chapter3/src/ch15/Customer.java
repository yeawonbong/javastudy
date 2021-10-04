package ch15;

public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    @Override
    public void order() {
//        Buy.super.order(); 둘 중 하나 선택을 하던가
        System.out.println("customer order"); // 아예 오버라이드를 해주어야 한다.
    }

    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    public void hello() {
        System.out.println("hello");
    }
}
