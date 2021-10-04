package ch15_2;

public interface Queue {
    void enQueue(String title);
    String deQueue();

    int getSize();
}
