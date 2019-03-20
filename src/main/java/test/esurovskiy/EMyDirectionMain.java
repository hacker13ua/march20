package test.esurovskiy;

import java.util.Arrays;

import static test.esurovskiy.EMyDirection.NORTH;
import static test.esurovskiy.EMyDirection.WEST;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class EMyDirectionMain {
    public static void main(String[] args) {
        System.out.println(NORTH);
        System.out.println(NORTH.name());
        System.out.println(WEST.ordinal());
        System.out.println(Arrays.toString(EMyDirection.values()));
        System.out.println(EMyDirection.valueOf("EAST"));
        System.out.println(EMyDirection.valueOf("EAST") == EMyDirection.EAST);
        for (final EMyDirection direction : EMyDirection.values()) {
            System.out.println(direction.getShortName());
            System.out.println(direction.getDirectionCode());
        }
    }
}
