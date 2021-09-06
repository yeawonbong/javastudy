package ch21;

public class ObjectDeepCopyTest {
    public static void main(String[] args) {
        Book[] library = new Book[5]; // 객체 배열
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        for(int i = 0; i < library.length; i++) {
            copyLibrary[i].setAuthor(library[i].getAuthor());
            copyLibrary[i].setTitle(library[i].getTitle());
        }


        System.out.println("== library ==");
        for (Book book : library) {
            System.out.println(book); // 객체 주소값
            book.showInfo();
        }
        System.out.println("\n== deep copy library ==");
        for (Book book : copyLibrary) {
            System.out.println(book); // 객체 주소값
            book.showInfo();
        }
    }
}
