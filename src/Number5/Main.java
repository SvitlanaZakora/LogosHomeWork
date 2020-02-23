package Number5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String enterSentence = sc.nextLine();
        String[] arrWords = enterSentence.split(" ");
        int maxCounter = 0;
        String maxWord = null;
        for (String word : arrWords) {
            int counter = 0;
            for(int i = 0; i<arrWords.length; i++){
                if(arrWords[i].equals(word)){
                    counter++;
                }
            }
            if(counter>maxCounter){
                maxCounter=counter;
                maxWord = word;
            }

        }
        System.out.println("Cлово " + maxWord + " повторюється " + maxCounter + " разів");




    }
}
