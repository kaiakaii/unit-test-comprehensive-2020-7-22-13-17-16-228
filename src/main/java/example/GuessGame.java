package example;

import java.util.Scanner;

public class GuessGame {

    private GenerateRandomNum generateRandomNum = new GrnerateRandomImpl();
    private Valid valid = new ValidImpl();

    public GuessGame() {
    }

    public String guess(String guess,String generateNum) {

        if (guess.equals(generateNum)) {//全对
            return "4A0B";
        }
        int rightNumPositionRight = 0;
        int rightNumWrongPosition = 0;
        String[] guessArray = guess.split("");
        String[] randomArray = generateNum.split("");
        for (int i = 0; i < guessArray.length; i++) {
            if (guessArray[i].equals(randomArray[i])) {
                rightNumPositionRight++;
            }
            if (generateNum.contains(guessArray[i]) && !guessArray[i].equals(randomArray[i])) {
                rightNumWrongPosition++;
            }
        }
        return rightNumPositionRight + "A" + rightNumWrongPosition + "B";
    }



    public void startGame(){
        String randomNum = generateRandomNum.generateRandomNum();
        Scanner sc = new Scanner(System.in);
        int times = 6;
        while (times > 0){
            String guessNum = sc.nextLine();
            if(valid.isValidNum(guessNum)){
                System.out.println(this.guess(guessNum,randomNum));
            }else{
                System.out.println("Wrong Input，Input again");
            }
            times--;
        }
    }
}
