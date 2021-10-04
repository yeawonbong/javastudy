package ch15_2;

import java.util.ArrayList;

public class Shelf {
    protected ArrayList<String> shelf;
    public Shelf() { //생성자
        shelf = new ArrayList<String>();
    }
    public ArrayList<String> getShelf(){
        return shelf;
    }
    public int getCount() {
        return shelf.size();
    }
}
