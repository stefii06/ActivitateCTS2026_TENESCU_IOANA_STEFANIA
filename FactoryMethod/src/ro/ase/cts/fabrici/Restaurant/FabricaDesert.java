package ro.ase.cts.fabrici.Restaurant;

import ro.ase.cts.clase.Restaurant.Clatite;
import ro.ase.cts.clase.Restaurant.FelDeMnacare;
import ro.ase.cts.clase.Restaurant.Papanasi;
import ro.ase.cts.enums.Restaurant.TipDesert;
import ro.ase.cts.enums.Restaurant.TipMancare;

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
