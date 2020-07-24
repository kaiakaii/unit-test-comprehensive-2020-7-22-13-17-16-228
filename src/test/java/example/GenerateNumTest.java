package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

public class GenerateNumTest {
    @Test
    void should_return_false_when_generate_num_given_1124() {
        //given
        Valid valid = new ValidImpl();
        GenerateRandomNum generateRandomNum = Mockito.mock(GenerateRandomNum.class);
        given(generateRandomNum.generateRandomNum()).willReturn("1124");
        //when
        boolean actual = valid.isValidNum(generateRandomNum.generateRandomNum());

        //then
        assertEquals(false,actual);
    }
}
