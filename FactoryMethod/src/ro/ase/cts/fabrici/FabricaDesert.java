package ro.ase.cts.fabrici;

import ro.ase.cts.clase.*;
import ro.ase.cts.enums.TipDesert;
import ro.ase.cts.enums.TipMancare;
import ro.ase.cts.enums.TipSupa;

public class FabricaDesert implements FabricaAbstracta {

    @Override
    public FelDeMnacare getFelDeMnacare(TipMancare tipMancare, float pret, float gramaj) {
        return getFelDeMnacare(tipMancare, pret, gramaj,500);
    }

    @Override
    public FelDeMnacare getFelDeMnacare(TipMancare tipMancare, float pret, float gramaj, int calorii) {
        if (tipMancare == TipDesert.CLATITE) {
            return new Clatite(pret, gramaj, calorii);
        } else if (tipMancare == TipDesert.PAPANASI) {
            return new Papanasi(pret, gramaj, calorii);
        }
        return null;
    }
}
