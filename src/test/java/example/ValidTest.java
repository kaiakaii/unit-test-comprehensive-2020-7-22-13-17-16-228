package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidTest {
    @Test
    void should_false_when_isValid_given_123() {
        //given
        Valid valid = new ValidImpl();

        //when
        boolean result = valid.isValidNum("123");

        //then
        assertEquals(false, result);

    }

    @Test
    void should_false_when_isValid_given_abc() {
        //given
        Valid valid = new ValidImpl();

        //when
        boolean result = valid.isValidNum("abc");

        //then
        assertEquals(false, result);

    }

    @Test
    void should_false_when_isValid_given_1125() {
        //given
        Valid valid = new ValidImpl();

        //when
        boolean result = valid.isValidNum("1125");


        //then
        assertEquals(false, result);

    }

    @Test
    void should_false_when_isValid_given_1325() {
        //given
        Valid valid = new ValidImpl();

        //when
        boolean result = valid.isValidNum("1325");


        //then
        assertEquals(true, result);
    }
}
