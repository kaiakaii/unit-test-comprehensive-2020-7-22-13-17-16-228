package example;

public class GuessGame implements GenerateRandomNum{

    public String guess(String guess, String generateNum) {
        if(guess.equals(generateNum)){
            return "4A0B";
        }
        return "2A2B";
    }

    public String generateRandomNum(){
        return "";
    }

    public boolean isValid(String guess){

        return false;
    }
}
