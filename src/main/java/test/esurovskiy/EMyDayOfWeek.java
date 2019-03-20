package test.esurovskiy;

public enum EMyDayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public EMyDayOfWeek nextDay() {
        int ordinal = this.ordinal();
        EMyDayOfWeek[] values = EMyDayOfWeek.values();
        int length = values.length;
        return values[(ordinal + 1) % length];
    }
}
