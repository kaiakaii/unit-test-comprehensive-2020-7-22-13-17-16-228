package example;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class GuessGame implements GenerateRandomNum {

    private  String randomNum;

    public GuessGame(String randomNum) {
        this.randomNum = randomNum;
    }

    public GuessGame() {
    }

    public String guess(String guess, String generateNum) {
        if (guess.equals(generateNum)) {//全对
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
        for(int i=0;i<guess.length();i++){
            if(guess.charAt(i)<48 || guess.charAt(i)>57){
                return false;
            }
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
    public void startGame(){
        String randomNum = this.generateRandomNum();
        Scanner sc = new Scanner(System.in);
        int times = 6;
        while (times > 0){
            String guessNum = sc.nextLine();
            if(this.isValid(guessNum)){
                this.guess(guessNum,randomNum);
            }else{
                System.out.println("Wrong Input，Input again");
            }
            times--;
        }
    }
}
