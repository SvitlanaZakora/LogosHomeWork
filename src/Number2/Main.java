package Number2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String enterText = sc.next();
        String arrVowel [] = {"a","e","y","u","i","o"};
        for(int i=0; i<arrVowel.length; i++){
            enterText=enterText.toLowerCase().replace(arrVowel[i],"-");
        }
        System.out.println(enterText);

    }
}
