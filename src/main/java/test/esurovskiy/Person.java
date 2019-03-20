package test.esurovskiy;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class Person {
    String firstName;
    String lastName;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) throws InvalidAgeException {
        if (age > 120) {
            throw new InvalidAgeException("Too old");
        }else if(age<1){
            throw new InvalidAgeException("Too low value");
        }

        this.age = age;
    }
}
