package Number3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи речення: ");
        String enterSentence = sc.nextLine();
        char arrEnterSentence[] = enterSentence.toCharArray();
        int count=1;
        for(int i=0; i<arrEnterSentence.length; i++){
            if(arrEnterSentence[i] == ' '){
                count++;
            }
        }
        System.out.println("В реченні " + count + " слів");


    }



}
