package ru.netology.sgr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQR.csv")
    public void testCalcNumberOfSquareNumbers(int expected, int startOfRange, int endOfRange) {
        SQRService service = new SQRService();
        int actual = service.calcNumberOfSquareNumbers(startOfRange, endOfRange);
        Assertions.assertEquals(expected, actual);
    }
}
