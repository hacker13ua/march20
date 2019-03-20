package test.esurovskiy;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class Main3 {
    public static void main(String[] args) {
        try {
            final Person person = new Person();
            person.setFirstName("f n");
            person.setLastName("l n ");
            person.setAge(130);
        } catch (InvalidAgeException iae) {
            iae.printStackTrace();
        }
        System.out.println("Program exit");
    }
}
