package ro.ase.cts.main;

import ro.ase.cts.clase.Spital.Reteta;

public class MainSpital {
    public static void main(String[] args) {

        Reteta reteta1 = new Reteta("Anti-Gripa", 1022, 60, 30);
        Reteta rereta2 = (Reteta) reteta1.clone();

        rereta2.setDenumire("Anti-Alergii");
        rereta2.setCodReteta(1023);

        System.out.println(reteta1.toString());
        System.out.println(rereta2.toString());
    }




}
