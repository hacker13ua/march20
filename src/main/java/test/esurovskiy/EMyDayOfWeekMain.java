package test.esurovskiy;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class EMyDayOfWeekMain {
    public static void main(String[] args) {
        for (final EMyDayOfWeek value : EMyDayOfWeek.values()) {
            System.out.println(value);
        }

        System.out.println(EMyDayOfWeek.SATURDAY
                .nextDay()
                .nextDay());
    }
}
