package test.esurovskiy;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class Main1 {
    public static void main(String[] args) {
        throwException(2);
        System.out.println("Program exit");
    }

    public static void throwException(int type) {
        try {
            Object o = null;
            Object o1 = new Object();
            byte[] array = new byte[]{1};
            switch (type) {
                case 0:
                    throw new NullPointerException();
//                    break;
                case 1:
                    ((Integer) o1).byteValue();
                    break;
                case 2:
                    System.out.println(array[1]);
                    break;

            }

        } catch (NullPointerException | ClassCastException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
    }
}
