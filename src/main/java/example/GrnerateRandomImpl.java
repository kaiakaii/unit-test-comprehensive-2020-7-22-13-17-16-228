package example;

import java.util.Random;

public class GrnerateRandomImpl implements GenerateRandomNum {
    @Override
    public String generateRandomNum() {
        String charList = "0123456789";
        StringBuilder generateNum = new StringBuilder();
        Random random = new Random();
        for(int i=0;i<charList.length();i++)
        {
            generateNum.append(charList.charAt(Math.abs(random.nextInt()) % charList.length()));
        }
        return generateNum.toString();
    }
}
