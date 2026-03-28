package ro.ase.cts.fabrici.Restaurant;

import ro.ase.cts.clase.Restaurant.FelDeMnacare;
import ro.ase.cts.clase.Restaurant.SupaCiuperci;
import ro.ase.cts.clase.Restaurant.SupaLegume;
import ro.ase.cts.enums.Restaurant.TipMancare;
import ro.ase.cts.enums.Restaurant.TipSupa;

public class FabricaSupa implements FabricaAbstracta{
    @Override
    public FelDeMnacare getFelDeMnacare(TipMancare tipMancare, float pret, float gramaj) {
        if (tipMancare== TipSupa.SupaLegume){
            return new SupaLegume(pret,gramaj);
        } else if (tipMancare==TipSupa.SupaCiuperci) {
            return new SupaCiuperci(pret,gramaj);

        }
        return null;
    }

    @Override
    public FelDeMnacare getFelDeMnacare(TipMancare tipMancare, float pret, float gramaj, int calorii) {
        return this.getFelDeMnacare(tipMancare,pret,gramaj);
    }
}
