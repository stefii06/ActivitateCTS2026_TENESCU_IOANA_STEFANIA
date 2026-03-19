package ro.ase.cts.main;

import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.RezervareAbstracta;

public class Main {
    public static void main(String[] args) {
        Rezervare rez1 = new Rezervare("Dan", 20,20, "0725022748");
        Rezervare rez2= (Rezervare) rez1.clone(); // nu respectam dependency inversion

        //facem metoda cu dependency inversion



        rez2.setOraRezervare(18);
        rez2.setZiuaReservarii(24);


        System.out.println( rez1.toString());
        System.out.println(rez2.toString() );



    }
}
