
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeoPoliticalZoneTest {

    @Test
    public void testGeoPoliticalZone_IPassInTheRightState() {
        GeoZone  geoZone = new GeoZone();

        assertEquals("SOUTH WEST" , geoZone.getZone("lagos"));

    }

    @Test
    public void testGeoPoliticalZone_IPassAWrongState() {
        GeoZone  geoZone = new GeoZone();

        assertThrows(IllegalArgumentException.class, () -> geoZone.getZone("american"));
    }

}
