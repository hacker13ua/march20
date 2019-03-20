package test.esurovskiy;

public enum EMyDirection {
    NORTH(1),
    EAST(2),
    WEST(3),
    SOUTH(4);

    private int directionCode;

    EMyDirection(int i) {
        directionCode = i;
    }

    public int getDirectionCode() {
        return directionCode;
    }

    String getShortName() {
        switch (this) {
            case NORTH:
                return "N";
            case EAST:
                return "E";
            case WEST:
                return "W";
            case SOUTH:
                return "S";
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return "Direction is: " + name();
    }
}
