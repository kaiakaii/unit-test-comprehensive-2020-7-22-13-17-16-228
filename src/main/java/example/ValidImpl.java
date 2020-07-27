package example;

import java.util.Arrays;
import java.util.HashSet;

public class ValidImpl implements Valid {
    @Override
    public boolean isValidNum(String guess) {
        //todo 3test
        if(guess.length() != 4){
            return false;
        }
        for(int i=0;i<guess.length();i++){
            if(guess.charAt(i)<48 || guess.charAt(i)>57){
                return false;
            }
        }
        String[] guessArray = guess.split("");
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(guessArray));
        return hashSet.size() == guessArray.length;
    }
}
