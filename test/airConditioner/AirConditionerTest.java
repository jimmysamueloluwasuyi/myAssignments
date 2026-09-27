package airConditioner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    public void testThatIHaveAnAc_MyAcIsOff_ITurnItOn_ItIsOn() {
        AirConditioner myAc = new AirConditioner();
        assertFalse(myAc.isOn());

        myAc.turnOn();
        assertTrue(myAc.isOn());
    }

    @Test
    public void testThatIHaveAnAc_MyAcIsOff_ITurnItOn_ItIsOn_ITurnItOff_ItIsOff() {
        AirConditioner myAc = new AirConditioner();
        assertFalse(myAc.isOn());

        myAc.turnOn();
        assertTrue(myAc.isOn());

        myAc.turnOff();
        assertFalse(myAc.isOn());
    }

    @Test
    public void testThatIHaveAnAc_MyAcIsOff_ITurnItOn_ItIsOn_IIncreaseTheTemperature_ItIncreases() {
        AirConditioner myAc = new AirConditioner();
        assertFalse(myAc.isOn());

        myAc.turnOn();
        assertTrue(myAc.isOn());
        assertEquals(16 , myAc.checkTemperature());

        myAc.increase();
        assertEquals(17 , myAc.checkTemperature());

    }

    @Test
    public void testThatIHaveAnAc_MyAcIsOff_ITurnItOn_ItIsOn_IIncreaseTheTemperature_ItIncreases_IDecreasesTheTemperature_ItDecreases() {
        AirConditioner myAc = new AirConditioner();
        assertFalse(myAc.isOn());

        myAc.turnOn();
        assertTrue(myAc.isOn());
        assertEquals(16 , myAc.checkTemperature());

        myAc.increase();
        assertEquals(17 , myAc.checkTemperature());

        myAc.decrease();
        assertEquals(16 , myAc.checkTemperature());

    }

    @Test
    public void testThatIHaveAnAc_MyAcIsOff_ITurnItOn_ItIsOn_IIncreaseTheTemperatureBeyound30_ItIsStill30() {
        AirConditioner myAc = new AirConditioner();
        assertFalse(myAc.isOn());

        myAc.turnOn();
        assertTrue(myAc.isOn());
        assertEquals(16 , myAc.checkTemperature());

        for (int count = 16; count < 30; count++) {
            myAc.increase();
        }

        assertEquals(30 , myAc.checkTemperature());

        myAc.increase();
        assertEquals(30 , myAc.checkTemperature());

    }

    @Test
    public void testThatIHaveAnAc_MyAcIsOff_ITurnItOn_ItIsOn_IDecreaseTheTemperatureBelow16_ItIsStill16() {
        AirConditioner myAc = new AirConditioner();
        assertFalse(myAc.isOn());

        myAc.turnOn();
        assertTrue(myAc.isOn());
        assertEquals(16 , myAc.checkTemperature());

        myAc.decrease();
        assertEquals(16 , myAc.checkTemperature());

    }
}
