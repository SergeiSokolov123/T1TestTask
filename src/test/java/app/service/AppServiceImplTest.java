package app.service;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppServiceImplTest {

    private final AppServiceImpl appService = new AppServiceImpl();

    @Test
    void testGetData() {
        String inputString = "acaabb";
        Map<Character, Integer> expectedResult = Map.of(
                'a', 3,
                'b', 2,
                'c', 1
        );

        Map<Character, Integer> result = appService.getData(inputString);

        assertEquals(expectedResult, result);
    }
}
