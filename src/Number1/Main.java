package Number1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");
        String enterWord = sc.next();
        int halfSize = enterWord.toLowerCase().length() / 2;
        StringBuilder twoString = new StringBuilder(enterWord.toLowerCase().substring(enterWord.toLowerCase().length() - halfSize));
        if (enterWord.toLowerCase().substring(0, halfSize).equals(twoString.reverse().toString())) {
            System.out.println("Word " + enterWord + " is palindrom ");

        } else {
            System.out.println("Word " + enterWord + " isn't palindrom ");
        }

    }
}
