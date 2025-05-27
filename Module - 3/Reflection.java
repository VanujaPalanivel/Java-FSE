import java.lang.reflect.*;

public class Reflection {
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Reflection");
        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method: " + m.getName());
            System.out.println("Parameters: " + m.getParameterCount());
        }

        Object obj = cls.getDeclaredConstructor().newInstance();
        Method m = cls.getMethod("sayHello", String.class);
        m.invoke(obj, "Vanuja");
    }
}