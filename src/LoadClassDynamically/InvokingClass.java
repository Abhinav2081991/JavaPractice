package LoadClassDynamically;

import java.lang.reflect.InvocationTargetException;

public class InvokingClass {


    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<?> c = Class.forName("src.LoadClassDynamically.TestDynamicClass");
        Object o = c.getDeclaredConstructor().newInstance();
        TestDynamicClass td = (TestDynamicClass) o;
        td.testMethod();


        Class<?> clazz = ClassLoader.getSystemClassLoader().loadClass("TestDynamicClass");
        Object o1 = clazz.getDeclaredConstructor().newInstance();
        TestDynamicClass td1= (TestDynamicClass) o1;
        td1.testMethod();
    }

}
