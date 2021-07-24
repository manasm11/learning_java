package testing01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Locale;

public class StringTest {

    @BeforeEach
    public void beforeEach(TestInfo info) {
        System.out.printf("### %s ###%n", info.getDisplayName());
    }

    @Test
    void test1() {
    }

    @Test
    void test2() {
//        fail("Daya kuchh gadbad hai !!!");
    }

    @Test
    @DisplayName("Length of string returned by string.length() is greater than zero.")
    void test3() {
//        fail("Kuchh bhoot badi gadbad hai !!!");
    }

    @ParameterizedTest
    @ValueSource(strings = {"ABCD", "AB", "  ", "CDS"})
    @DisplayName("Length of string returned by string.length() is greater than zero.")
    void lengthIsGreaterThan0(String string) {
        assertTrue(string.length() > 0);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "abcd, ABCD",
            "abc, ABC",
            "'', ''",
            "poi, POI"
    })
    void upper_case(String word, String capitalizedWord) {
        assertEquals(capitalizedWord, word.toUpperCase());
    }

    @ParameterizedTest(name = "\"{0}\".length() == {1} ")
    @CsvSource(value = {
            "abcd, 4",
            "'', 0",
            "ksdjfvbsdujvnikffsudjbviokfsdujbvgs, 35"
    })
    void word_length(String word, int length) {
        assertEquals(length, word.length());
    }
}
