public enum GeoPoliticalZone {

    LAGOS("SOUTH WEST"),
    OYO("SOUTH WEST"),
    OGUN("SOUTH WEST"),
    ONDO("SOUTH WEST"),
    OSUN("SOUTH WEST"),
    EKITI("SOUTH WEST"),

    ENUGU("SOUTH EAST"),
    IMO("SOUTH EAST"),
    ABIA("SOUTH EAST"),
    ANAMBRA("SOUTH EAST"),
    EBONYI("SOUTH EAST"),

    RIVERS("SOUTH SOUTH"),
    EDO("SOUTH SOUTH"),
    DELTA("SOUTH SOUTH"),
    BAYELSA("SOUTH SOUTH"),
    AKWA_IBOM("SOUTH SOUTH"),
    CROSS_RIVER("SOUTH SOUTH"),

    KANO("NORTH WEST"),
    KADUNA("NORTH WEST"),
    KATSINA("NORTH WEST"),
    KEBBI("NORTH WEST"),
    SOKOTO("NORTH WEST"),
    JIGAWA("NORTH WEST"),
    ZAMFARA("NORTH WEST"),

    BENUE("NORTH CENTRAL"),
    FCT("NORTH CENTRAL"),
    KOGI("NORTH CENTRAL"),
    KWARA("NORTH CENTRAL"),
    NASARAWA("NORTH CENTRAL"),
    NIGER("NORTH CENTRAL"),
    PLATEAU("NORTH CENTRAL"),

    ADAMAWA("NORTH EAST"),
    BAUCHI("NORTH EAST"),
    BORNO("NORTH EAST"),
    GOMBE("NORTH EAST"),
    TARABA("NORTH EAST"),
    YOBE("NORTH EAST");

    private final String zone;

    GeoPoliticalZone(String zone) {
        this.zone = zone;
    }

    public String getZone() {
        return zone;
    }

}
