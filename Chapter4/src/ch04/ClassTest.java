package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class c1 = Class.forName("ch04.Person");

        Person person = (Person)c1.newInstance();
        person.setName("Bong");
        System.out.println(person);

        Class c2 = person.getClass(); // 이미 클래스가 있는 상태여야함
        Person p = (Person)c2.newInstance(); // - default constructor가 불린다
        System.out.println(p);

        Class[] parameterType = {String.class};
        Constuctor cons = c2.getConstructor(parameterType);

        Object[] initargs = {"Kim"};
        Person kimPerson = (Person)cons.newInstance(initargs);
        System.out.println(kimPerson);
    }
}
