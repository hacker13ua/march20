package test.esurovskiy;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class ETestAssert {
    public static void main(String[] args) {
        int a = 10;
        int b = 9;
        if (a!=b){
            throw new AssertionError();
        }
        assert a == b;
        System.out.println("Program exit");
    }
}
