package Dz1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Integer arr[] = new Integer[10];
        for(int i=0; i<arr.length; i++){
            arr[i]= random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new ComparatorInt());
        System.out.println(Arrays.toString(arr));




    }
}
