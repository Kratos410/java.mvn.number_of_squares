package ru.netology.sgr;

public class SQRService {
    public int calcNumberOfSquareNumbers(int startOfRange, int endOfRange) {
        int result = 0;
        for (int number = 10; number <= 99; number++) {
            if (startOfRange <= number * number && number * number <= endOfRange) {
                result = result + 1;
            }
        }
        return result;
    }

}