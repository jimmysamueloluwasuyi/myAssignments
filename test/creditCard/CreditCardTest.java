package creditCard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditCardTest {

    private CreditCard myCreditCard;

    @BeforeEach
    public void startWith() {
        myCreditCard = new CreditCard();
    }

    @Test
    public void testThatTheGivenCreditCardIsNotAcceptedWhenItIs17Digit() {
        myCreditCard.setCreditCardLength("43885760140262668");
        assertFalse(myCreditCard.getCreditCardLength());
    }

    @Test
    public void testThatTheGivenCreditCardIsAcceptedWhenItIs16Digits() {
        myCreditCard.setCreditCardLength("4388576018402626");
        assertTrue(myCreditCard.getCreditCardLength());
    }

    @Test
    public void testThatTheGivenCreditCardIsAcceptedWhenItIs15Digits() {
        myCreditCard.setCreditCardLength("438857601840262");
        assertTrue(myCreditCard.getCreditCardLength());
    }

    @Test
    public void testThatTheGivenCreditCardIsAcceptedWhenItIs14Digits() {
        myCreditCard.setCreditCardLength("43885760184026");
        assertTrue(myCreditCard.getCreditCardLength());
    }

    @Test
    public void testThatTheGivenCreditCardIsAcceptedWhenItIs13Digits() {
        myCreditCard.setCreditCardLength("4388576018402");
        assertTrue(myCreditCard.getCreditCardLength());
    }

    @Test
    public void testThatTheGivenCreditCardIsNotAcceptedWhenItIs12Digits() {
        myCreditCard.setCreditCardLength("438857601840");
        assertFalse(myCreditCard.getCreditCardLength());
    }

    @Test
    public void testThatAnEmptyCreditCardIsNotAccepted() {
        myCreditCard.setCreditCardLength("");
        assertFalse(myCreditCard.getCreditCardLength());
    }

    @Test
    public void testThatACreditCardContainingLettersIsNotAccepted() {
        myCreditCard.setCreditCardLength("43885760184a2626");
        assertFalse(myCreditCard.getCreditCardLength());
    }

    @Test
    public void testThatIfTheCreditCardIsANegativeNumberItWillNotBeAccepted() {
        String number = "-69576018402626";

        myCreditCard.setCreditCardLength(number);
        assertFalse(myCreditCard.getCreditCardLength());
    }

    @Test
    public void testThatTheCreditCardIsAcceptedIfItIsWithInTheRangeOf13To16_AndTheCreditCardIsAVisaCardBecauseItBeginsWith4() {
        String number = "4388576018402626";

        myCreditCard.setCreditCardLength(number);
        assertTrue(myCreditCard.getCreditCardLength());

        myCreditCard.setCreditCardType(number);
        assertEquals("Visa Card", myCreditCard.getCreditCardType());
    }

    @Test
    public void testThatTheCreditCardIsAcceptedIfItIsWithInTheRangeOf13To16_AndTheCreditCardIsAMasterCardBecauseItBeginsWith5() {
        String number = "5388576018402626";

        myCreditCard.setCreditCardLength(number);
        assertTrue(myCreditCard.getCreditCardLength());

        myCreditCard.setCreditCardType(number);
        assertEquals("MasterCard", myCreditCard.getCreditCardType());
    }

    @Test
    public void testThatTheCreditCardIsAcceptedIfItIsWithInTheRangeOf13To16_AndTheCreditCardIsAmericanExpressCardBecauseItBeginsWith37() {
        String number = "37576018402626";

        myCreditCard.setCreditCardLength(number);
        assertTrue(myCreditCard.getCreditCardLength());

        myCreditCard.setCreditCardType(number);
        assertEquals("American Express Card", myCreditCard.getCreditCardType());
    }

    @Test
    public void testThatTheCreditCardIsAcceptedIfItIsWithInTheRangeOf13To16_AndTheCreditCardIsADiscoverCardBecauseItBeginsWith6() {
        String number = "69576018402626";

        myCreditCard.setCreditCardLength(number);
        assertTrue(myCreditCard.getCreditCardLength());

        myCreditCard.setCreditCardType(number);
        assertEquals("Discover Card", myCreditCard.getCreditCardType());
    }

    @Test
    public void testThatACreditCardWithAnUnsupportedFirstDigitIsUnknown() {
        String number = "1388576018402626";

        myCreditCard.setCreditCardLength(number);
        assertTrue(myCreditCard.getCreditCardLength());

        myCreditCard.setCreditCardType(number);
        assertEquals("Unknown Card", myCreditCard.getCreditCardType());
    }

    @Test
    public void testThatTheCreditCardIsAcceptedIfItIsWithInTheRangeOf13To16_AndTheCreditCardTypeIsValidated_ThenIDoubleEverySecondDigitsFromRightToLeftIfItResultsToASingleNumber_AndSumAllTheFirstNumbersInTheOddPlaceFromRightToLeft_TheSumTheResult_AndReturnTheResult() {
        String number = "4388576018402626";

        myCreditCard.setCreditCardLength(number);
        assertTrue(myCreditCard.getCreditCardLength());

        myCreditCard.setCreditCardType(number);
        assertEquals("Visa Card", myCreditCard.getCreditCardType());

        myCreditCard.setSumOfSecondDigitsAndALlDigitsInOddPlaces(number);
        assertEquals(75, myCreditCard.getSumOfSecondDigitsAndALlDigitsInOddPlaces());
    }

    @Test
    public void testThatTheCreditCardIsAcceptedIfItIsWithInTheRangeOf13To16_AndTheCreditCardTypeIsValidated_AndISumAndConfirmIfTheCardIsAValidCardByIfItIsDivisibleBy10() {
        String number = "4388576018402626";

        myCreditCard.setCreditCardLength(number);
        assertTrue(myCreditCard.getCreditCardLength());

        myCreditCard.setCreditCardType(number);
        assertEquals("Visa Card", myCreditCard.getCreditCardType());

        myCreditCard.setSumOfSecondDigitsAndALlDigitsInOddPlaces(number);

        myCreditCard.setCreditCardValidation();
        assertEquals("Invalid", myCreditCard.getCreditCardValidation());
    }

    @Test
    public void testThatTheCreditCardIsAcceptedIfItIsWithInTheRangeOf13To16_AndTheCreditCardTypeIsValidated_AndISumAndConfirmIfTheCardIsAValidCardByIfItIsDivisibleBy10ByCheckingAValidNumber() {
        String number = "4388576018410707";

        myCreditCard.setCreditCardLength(number);
        assertTrue(myCreditCard.getCreditCardLength());

        myCreditCard.setCreditCardType(number);
        assertEquals("Visa Card", myCreditCard.getCreditCardType());

        myCreditCard.setSumOfSecondDigitsAndALlDigitsInOddPlaces(number);

        myCreditCard.setCreditCardValidation();
        assertEquals("Valid", myCreditCard.getCreditCardValidation());
    }

    @Test
    public void testThatAValid15DigitAmericanExpressCardPassesAllChecks() {
        String number = "378282246310005";

        myCreditCard.setCreditCardLength(number);
        assertTrue(myCreditCard.getCreditCardLength());

        myCreditCard.setCreditCardType(number);
        assertEquals("American Express Card", myCreditCard.getCreditCardType());

        myCreditCard.setSumOfSecondDigitsAndALlDigitsInOddPlaces(number);

        myCreditCard.setCreditCardValidation();
        assertEquals("Valid", myCreditCard.getCreditCardValidation());
    }
}