package creditCard;

public class CreditCard {
    private boolean creditCardLength;
    private String creditCardType;
    private int sumOfSecondDigitsAndALlDigitsInOddPlaces;
    private String creditCardValidation;


    public boolean getCreditCardLength() {
        return creditCardLength;
    }

    public String getCreditCardType() {
        return creditCardType;
    }

    public int getSumOfSecondDigitsAndALlDigitsInOddPlaces() {
        return sumOfSecondDigitsAndALlDigitsInOddPlaces;
    }

    public String getCreditCardValidation() {
        return creditCardValidation;
    }


    public void setCreditCardLength(String number) {
        this.creditCardLength = number.length() >= 13
                && number.length() <= 16
                && containsOnlyDigits(number);
    }

    private boolean containsOnlyDigits(String number) {
        for (int index = 0; index < number.length(); index++) {
            char character = number.charAt(index);
            if (character < '0' || character > '9') {
                return false;
            }
        }
        return true;
    }

    public void setCreditCardType(String number) {
        if (number.startsWith("4")) {
            creditCardType = "Visa Card";
        }
        else if (number.startsWith("5")) {
            creditCardType = "MasterCard";
        }
        else if (number.startsWith("37")) {
            creditCardType = "American Express Card";
        }
        else if (number.startsWith("6")) {
            creditCardType = "Discover Card";
        }
        else {
            creditCardType = "Unknown Card";
        }
    }

    public void setSumOfSecondDigitsAndALlDigitsInOddPlaces(String number) {
        int sum = 0;
        for (int index = number.length() - 2; index >= 0; index -= 2) {
            int multiply = Character.getNumericValue(number.charAt(index)) * 2;

            if (multiply > 9) {
                sum += (multiply - 9);
            }
            else {
                sum += multiply;
            }
        }

        int sumOfOddNumbers = 0;
        for (int index = number.length() - 1; index >= 0; index -= 2) {
            sumOfOddNumbers += Character.getNumericValue(number.charAt(index));
        }

        sumOfSecondDigitsAndALlDigitsInOddPlaces = sumOfOddNumbers + sum;
    }

    public void setCreditCardValidation() {
        if (sumOfSecondDigitsAndALlDigitsInOddPlaces % 10 == 0) {
            creditCardValidation = "Valid";
        }
        else {
            creditCardValidation = "Invalid";
        }
    }

}