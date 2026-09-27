package bikePackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    @Test
    public void testThatIHaveABikeItisOff_ITurnedItOn_ItIsOn() {

        Bike bike = new Bike();
        assertFalse(bike.isOn());

        bike. turnOn();
        assertTrue(bike.isOn());

    }

    @Test
    public void testThatIHaveABikeItisOff_ITurnedItOn_ItIsOn_ITurnItOff_ItIsOff() {

        Bike bike = new Bike();
        assertFalse(bike.isOn());

        bike. turnOn();
        assertTrue(bike.isOn());

        bike.turnOff();
        assertFalse(bike.isOn());

    }

    @Test
    public void testThatIHaveABikeItisOff_ITurnedItOn_ItIsOn_IAcclerateIt_ItAccelerates() {

        Bike bike = new Bike();
        assertFalse(bike.isOn());

        bike. turnOn();
        assertTrue(bike.isOn());

        bike.accelerate();
        assertEquals(1 , bike.checkSpeed());

    }

    @Test
    public void testThatIHaveABikeItisOff_ITurnedItOn_ItIsOn_IAcclerateItOnGearOne_ItAcceleratesWithIncrementOfOne() {

        Bike bike = new Bike();
        assertFalse(bike.isOn());

        bike. turnOn();
        assertTrue(bike.isOn());

        bike.accelerate();
        assertEquals(1 , bike.checkSpeed());

        bike.accelerate();
        assertEquals(2 , bike.checkSpeed());

    }

    @Test
    public void testThatIHaveABikeItisOff_ITurnedItOn_ItIsOn_IAcclerateItOnGearTwo_ItAcceleratesWithIncrementOfTwo() {

        Bike bike = new Bike();
        assertFalse(bike.isOn());

        bike. turnOn();
        assertTrue(bike.isOn());

        for (int count = 1; count <= 21; count++) {
            bike.accelerate();
        }
        assertEquals(21 , bike.checkSpeed());

        bike.accelerate();
        assertEquals(23 , bike.checkSpeed());

    }

    @Test
    public void testThatIHaveABikeItisOff_ITurnedItOn_ItIsOn_IAcclerateItOnGearThree_ItAcceleratesWithIncrementOfThree() {

        Bike bike = new Bike();
        assertFalse(bike.isOn());

        bike. turnOn();
        assertTrue(bike.isOn());

        for (int count = 1; count <= 26; count++) {
            bike.accelerate();
        }
        assertEquals(31 , bike.checkSpeed());

        bike.accelerate();
        assertEquals(34 , bike.checkSpeed());

    }

    @Test
    public void testThatIHaveABikeItisOff_ITurnedItOn_ItIsOn_IAcclerateItOnGearFour_ItAcceleratesWithIncrementOfFour() {

        Bike bike = new Bike();
        assertFalse(bike.isOn());

        bike. turnOn();
        assertTrue(bike.isOn());

        for (int count = 1; count <= 30; count++) {
            bike.accelerate();
        }
        assertEquals(43 , bike.checkSpeed());

        bike.accelerate();
        assertEquals(47 , bike.checkSpeed());

    }

    @Test
    public void testThatIHaveABikeItisOff_ITurnedItOn_ItIsOn_IAcclerateIt_ItAccelerates_IdecelerateIt_Itdecelerates() {

        Bike bike = new Bike();
        assertFalse(bike.isOn());

        bike. turnOn();
        assertTrue(bike.isOn());

        bike.accelerate();
        assertEquals(1 , bike.checkSpeed());

        bike.decelerate();
        assertEquals(0 , bike.checkSpeed());

    }

    @Test
    public void testThatIHaveABikeItisOff_ITurnedItOn_ItIsOn_IDeclerateItOnGearOne_ItDeceleratesWithDecrementOfOne() {

        Bike bike = new Bike();
        assertFalse(bike.isOn());

        bike. turnOn();
        assertTrue(bike.isOn());

        bike.accelerate();
        assertEquals(1 , bike.checkSpeed());

        bike.decelerate();
        assertEquals(0 , bike.checkSpeed());

    }

    @Test
    public void testThatIHaveABikeItisOff_ITurnedItOn_ItIsOn_IDeclerateItOnGearTwo_ItDeceleratesWithDecrementOfTwo() {

        Bike bike = new Bike();
        assertFalse(bike.isOn());

        bike. turnOn();
        assertTrue(bike.isOn());

        for (int count = 1; count <= 21; count++) {
            bike.accelerate();
        }
        assertEquals(21 , bike.checkSpeed());

        bike.decelerate();
        assertEquals(19 , bike.checkSpeed());

    }

    @Test
    public void testThatIHaveABikeItisOff_ITurnedItOn_ItIsOn_IDeclerateItOnGearThree_ItDeceleratesWithDecrementOfThree() {

        Bike bike = new Bike();
        assertFalse(bike.isOn());

        bike. turnOn();
        assertTrue(bike.isOn());

        for (int count = 1; count <= 26; count++) {
            bike.accelerate();
        }
        assertEquals(31 , bike.checkSpeed());

        bike.decelerate();
        assertEquals(28 , bike.checkSpeed());

    }

    @Test
    public void testThatIHaveABikeItisOff_ITurnedItOn_ItIsOn_IDeclerateItOnGearFour_ItDeceleratesWithDecrementOfFour() {

        Bike bike = new Bike();
        assertFalse(bike.isOn());

        bike. turnOn();
        assertTrue(bike.isOn());

        for (int count = 1; count <= 30; count++) {
            bike.accelerate();
        }
        assertEquals(43 , bike.checkSpeed());

        bike.decelerate();
        assertEquals(39 , bike.checkSpeed());

    }

}
