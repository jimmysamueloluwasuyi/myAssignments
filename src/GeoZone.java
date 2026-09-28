public class GeoZone {

    public String getZone(String state) {
        String states = state.toUpperCase();

        try {
            GeoPoliticalZone zone = GeoPoliticalZone.valueOf(states);
            return zone.getZone();
        }

        catch (IllegalArgumentException e) {
            throw  new IllegalArgumentException("invalid state");
        }
    }

}
