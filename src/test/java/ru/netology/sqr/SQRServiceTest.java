package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void calcTestMultipleNumbersSearch() {
        SQRService service = new SQRService();

        int actual = service.calcSQR(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTestSearchForOneNumbers() {
        SQRService service = new SQRService();

        int actual = service.calcSQR(50, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
}