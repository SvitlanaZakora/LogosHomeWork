package Number4;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введи текст: ");
            String enterSentence = sc.nextLine();
            char arrEnterSentence[] = enterSentence.toCharArray();
            int count=0;
            for(int i=0; i<arrEnterSentence.length; i++){
                if(arrEnterSentence[i] == '.'){
                    count++;
                }
            }
            System.out.println("В тексті " + count + " речень");

        }



    }

