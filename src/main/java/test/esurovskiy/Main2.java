package test.esurovskiy;

import java.io.FileNotFoundException;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class Main2 {
    public static void main(String[] args) {
        method2();
    }

    static void method1() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    static void method2() {
        try {
            method1();
        } catch (FileNotFoundException f) {
            throw new RuntimeException(f);
        }
    }
}
