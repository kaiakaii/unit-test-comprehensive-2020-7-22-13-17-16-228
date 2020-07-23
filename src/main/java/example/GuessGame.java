package example;

import java.util.HashSet;
import java.util.Random;

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
        String charList = "0123456789";
        String generateNum = "";
        Random random = new Random();
        for(int i=0;i<charList.length();i++)
        {
            generateNum += charList.charAt(Math.abs(random.nextInt())%charList.length());
        }
        return generateNum;
    }

    public boolean isValid(String guess) {
        if(guess.length() != 4){
            return false;
        }
        String[] guessArray = guess.split("");
        HashSet<String> hashSet = new HashSet<String>();
        for (int i = 0; i < guessArray.length; i++) {
            hashSet.add(guessArray[i]);
        }
        if (hashSet.size() == guessArray.length) {
            return true;
        } else {
            return false;
        }

    }
}
