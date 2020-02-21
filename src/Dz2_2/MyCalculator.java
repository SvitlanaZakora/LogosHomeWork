package Dz2_2;

import Dz2.Numerable;

public class MyCalculator implements Numerable {
    private int a,b;
    public MyCalculator(int a, int b){
        this.a=a;
        this.b=b;
    }

    @Override
    public void plus() {
        System.out.println("Додавання: " + (a+b));
    }

    @Override
    public void minus() {
        System.out.println("Віднімання: " + Math.abs(a-b));
    }

    @Override
    public void multiply() {
        System.out.println( "Множення: " + (a*b));
    }

    @Override
    public void devide() {
        System.out.println("Ділення: "+ (a/b));
    }
}
