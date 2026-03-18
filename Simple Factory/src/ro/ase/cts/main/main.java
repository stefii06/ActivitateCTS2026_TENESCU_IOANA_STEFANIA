package ro.ase.cts.main;

import ro.ase.cts.clase.RESTAURANT.Supa;
import ro.ase.cts.clase.STB.MijlocTransport;
import ro.ase.cts.factory.RESTAURANT.FabricaSupa;
import ro.ase.cts.factory.RESTAURANT.TipSupa;
import ro.ase.cts.factory.STB.TipTransport;
import ro.ase.cts.factory.STB.Fabrica;

public class main {
    public static void main(String[] args) throws Exception {

        Fabrica fabrica = new Fabrica();
        MijlocTransport autobuz = fabrica.getMijlocTransport(TipTransport.AUTOBUZ, 10, "PH123");
        MijlocTransport tramvai = fabrica.getMijlocTransport(TipTransport.TRAMVAI,20, "BR123");

        autobuz.afisareDescriere();
        tramvai.afisareDescriere();

        FabricaSupa fabricaSupa = new FabricaSupa();
        Supa supalegume = fabricaSupa.getSupa(TipSupa.SupaDeLegume, "vegan", 6);
        Supa supaCiuperci = fabricaSupa.getSupa(TipSupa.SupaDeCiuperci, "Vegetarian", 4);
        Supa supaVita= fabricaSupa.getSupa(TipSupa.SupaDeVita, "carnivor", 2);
        supaCiuperci.afisareDescriere();
        supaVita.afisareDescriere();
        supalegume.afisareDescriere();




    }
}
