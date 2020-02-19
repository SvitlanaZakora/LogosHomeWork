package Dz2;

public class Coin {
    public void coinUp(){
        double a = Math.random();
        if (a<=0.5){
            System.out.println ("Монетка показує: Orel");
        }else{
            System.out.println ("Монетка показує: Reshka" );
        }
    }

}
