package Dz3;

public class Main {
    public static void main(String[] args) {
        double a= 256.978234;
        float b = 1638.975423f;
        char arr[]= new char[10];


        for(int i=0; i<=arr.length; i++){
            double res = Math.max(a,b)/10;
            if(arr[1]==0){
                System.out.println(res + "*" + Math.pow(10,(i+1)));
//                double res =
//                System.out.println( Math.pow(10.0,i));

            }
        }
//        System.out.println(Math.max(a,b));

    }
}
