package Dz2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        Avto arr[][] = new Avto[random.nextInt(3)+1][random.nextInt(3)+1];
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j]= new Avto(random.nextInt(100),random.nextInt(20)+2000);
            }
        }

        System.out.println("1-Вивести масив" + "2-Змінити параметри Авто");
        int enterNumber = sc.nextInt();
        switch (enterNumber){
            case 1:{
                for(int i =0; i<arr.length; i++)
                System.out.println(Arrays.deepToString(arr[i]));

            }
            case 2:{
                //TODO
            }
        }


    }
}
