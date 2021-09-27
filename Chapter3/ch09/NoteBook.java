package ch09;

public abstract class NoteBook extends Computer{ //추상 메서드가 구현되지 않았기 때문에, abstract class여야 한다.

    @Override
    public void display() {
        System.out.println("NoteBook display");
    }
}
