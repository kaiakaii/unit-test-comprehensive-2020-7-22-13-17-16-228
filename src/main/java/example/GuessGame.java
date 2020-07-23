package example;

public class GuessGame implements GenerateRandomNum {

    private final String randomNum;

    public GuessGame(String randomNum) {
        this.randomNum = randomNum;
    }

    public String guess(String guess, String generateNum) {
        if (guess.equals(generateNum)) {
            return "4A0B";
        }
        int countA = 0;
        int countB = 0;
        String[] guessArray = guess.split("");
        String[] randomArray = generateNum.split("");
        for (int i = 0; i < guessArray.length; i++) {
            if (guessArray[i].equals(randomArray[i])) {
                countA++;
            }
            if (generateNum.contains(guessArray[i]) && !guessArray[i].equals(randomArray[i])) {
                countB++;
            }
        }

        return countA + "A" + countB + "B";
    }

    public String generateRandomNum() {
        return "";
    }

    public boolean isValid(String guess) {

        return false;
    }
}
