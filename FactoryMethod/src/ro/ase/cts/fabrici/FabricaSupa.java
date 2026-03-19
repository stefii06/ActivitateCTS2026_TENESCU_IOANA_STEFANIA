package ro.ase.cts.fabrici;

import ro.ase.cts.clase.FelDeMnacare;
import ro.ase.cts.clase.Supa;
import ro.ase.cts.clase.SupaCiuperci;
import ro.ase.cts.clase.SupaLegume;
import ro.ase.cts.enums.TipMancare;
import ro.ase.cts.enums.TipSupa;

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
