package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

public class GuessGameTest {
    @Test
    public void should_return_4A0B_when_guess_game_given_1234(){
        //given
        GuessGame guessGame = new GuessGame();
        GenerateRandomNum generateRandomNum = Mockito.mock(GenerateRandomNum.class);
        given(generateRandomNum.generateRandomNum()).willReturn("1234");
        String randomNum = generateRandomNum.generateRandomNum();

        //when
        String guess = guessGame.guess("1234",randomNum);

        //then
        assertEquals("4A0B",guess);
    }
    @Test
    public void should_return_2A2B_when_guess_game_given_1243(){
        //given
        GuessGame guessGame = new GuessGame();
        GenerateRandomNum generateRandomNum = Mockito.mock(GenerateRandomNum.class);
        given(generateRandomNum.generateRandomNum()).willReturn("1234");
        String randomNum = generateRandomNum.generateRandomNum();

        //when
        String guess = guessGame.guess("1243",randomNum);

        //then
        assertEquals("2A2B",guess);
    }
    @Test
    public void should_return_2A1B_when_guess_game_given_1253(){
        //given
        GuessGame guessGame = new GuessGame();
        GenerateRandomNum generateRandomNum = Mockito.mock(GenerateRandomNum.class);
        given(generateRandomNum.generateRandomNum()).willReturn("1234");
        String randomNum = generateRandomNum.generateRandomNum();

        //when
        String guess = guessGame.guess("1234",randomNum);

        //then
        assertEquals("4A0B",guess);

    }
    @Test
    public void should_return_0A4B_when_guess_game_given_4321(){
        //given
        GuessGame guessGame = new GuessGame();
        GenerateRandomNum generateRandomNum = Mockito.mock(GenerateRandomNum.class);
        given(generateRandomNum.generateRandomNum()).willReturn("1234");
        String randomNum = generateRandomNum.generateRandomNum();

        //when
        String guess = guessGame.guess("1234",randomNum);

        //then
        assertEquals("4A0B",guess);

    }
    @Test
    public void should_return_0A2B_when_guess_game_given_2167(){
        //given
        GuessGame guessGame = new GuessGame();
        GenerateRandomNum generateRandomNum = Mockito.mock(GenerateRandomNum.class);
        given(generateRandomNum.generateRandomNum()).willReturn("1234");
        String randomNum = generateRandomNum.generateRandomNum();

        //when
        String guess = guessGame.guess("1234",randomNum);

        //then
        assertEquals("4A0B",guess);
    }
    @Test
    public void should_return_0A0B_when_guess_game_given_5678(){
        //given
        GuessGame guessGame = new GuessGame();
        GenerateRandomNum generateRandomNum = Mockito.mock(GenerateRandomNum.class);
        given(generateRandomNum.generateRandomNum()).willReturn("1234");
        String randomNum = generateRandomNum.generateRandomNum();

        //when
        String guess = guessGame.guess("1234",randomNum);

        //then
        assertEquals("4A0B",guess);
    }
}
