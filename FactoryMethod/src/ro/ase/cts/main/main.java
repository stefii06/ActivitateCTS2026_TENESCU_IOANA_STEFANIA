package ro.ase.cts.main;

import ro.ase.cts.clase.Restaurant.FelDeMnacare;
import ro.ase.cts.enums.Restaurant.TipDesert;
import ro.ase.cts.enums.Restaurant.TipSupa;
import ro.ase.cts.fabrici.Restaurant.FabricaDesert;
import ro.ase.cts.fabrici.Restaurant.FabricaSupa;

public class main {
    public static void main(String[] args) {

        FabricaDesert fabricaDesert = new FabricaDesert();
        FabricaSupa fabricaSupa = new FabricaSupa();

        FelDeMnacare supaCiuperci= fabricaSupa.getFelDeMnacare(TipSupa.SupaCiuperci, 20, 350);
        FelDeMnacare supaLegume= fabricaSupa.getFelDeMnacare(TipSupa.SupaLegume, 15, 250);

        FelDeMnacare clatite= fabricaDesert.getFelDeMnacare(TipDesert.CLATITE, 35, 400, 350);
        FelDeMnacare papanasi = fabricaDesert.getFelDeMnacare(TipDesert.PAPANASI, 30, 270, 400);

        supaLegume.afisare();
        supaCiuperci.afisare();
        clatite.afisare();
        papanasi.afisare();
    }

}
