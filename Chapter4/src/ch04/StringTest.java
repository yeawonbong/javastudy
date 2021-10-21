package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {
    public static void main(String[] args) throws ClassNotFoundException {

        Class c = Class.forName("java.lang.String"); //동적로딩
        System.out.println("======Constructor======");
        Constructor[] cons = c.getConstructors();
        for (Constructor co : cons) {
            System.out.println(co);
        }
        System.out.println("======Method======");
        Method[] ms = c.getMethods();
        for (Method m : ms) {
            System.out.println(m);
        }
    }
}
