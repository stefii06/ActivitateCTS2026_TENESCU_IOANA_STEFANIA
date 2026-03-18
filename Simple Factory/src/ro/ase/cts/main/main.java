package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.MijlocTransport;
import ro.ase.cts.clase.Tramvai;
import ro.ase.cts.factory.TipTransport;
import ro.ase.cts.factory.Fabrica;

public class main {
    public static void main(String[] args) {

        Fabrica fabrica = new Fabrica();
        MijlocTransport autobuz = fabrica.getMijlocTransport(TipTransport.AUTOBUZ, 10, "PH123");
        MijlocTransport tramvai = fabrica.getMijlocTransport(TipTransport.TRAMVAI,20, "BR123");

        autobuz.afisareDescriere();
        tramvai.afisareDescriere();



    }
}
