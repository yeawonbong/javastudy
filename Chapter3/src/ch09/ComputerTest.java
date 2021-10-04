package ch09;

public class ComputerTest {
    public static void main(String[] args) {

        Computer desktop1 = new Desktop(); //상위클래스 타입으로도 생성 가능
        Desktop desktop2 = new Desktop();

        Computer computer = new MyNoteBook();

        desktop1.display();

    }
}
