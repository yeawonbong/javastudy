package ch15;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.hello();

        Buy buyer = customer; //upcasting (묵시적 형변환)
        buyer.buy();
        buyer.order();
//      buyer.sell(); 오류 - 타 인터페이스의 메서드 호출 불가

        Sell seller = customer;
        seller.sell();
        seller.order();
//      seller.buy(); 오류

        
//====================================
        ((Buy)customer).buy(); //변수 없이 캐스팅하여 직접 호출가
//      ((Sell)customer).buy(); 이것 역시 호출불가
    }
}
