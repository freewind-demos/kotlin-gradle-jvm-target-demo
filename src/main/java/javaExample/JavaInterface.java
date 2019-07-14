package javaExample;

public interface JavaInterface {
    default void hello() {
        System.out.println("Hello from default method of MyInterface");
    }
}

