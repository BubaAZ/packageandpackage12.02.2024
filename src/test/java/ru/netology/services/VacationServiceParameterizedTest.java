package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class VacationServiceParameterizedTest {

    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/VacationService.csv")
    void shouldCalculateAmountMonthOfRest(int expected, int income, int expense, int threshold) {

        VacationService service = new VacationService();

        int actual = service.calcMonth(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
