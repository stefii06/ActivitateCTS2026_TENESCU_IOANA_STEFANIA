package ro.ase.cts.fabrici.Restaurant;

import ro.ase.cts.clase.Restaurant.FelDeMnacare;
import ro.ase.cts.enums.Restaurant.TipMancare;

public interface FabricaAbstracta {
    public FelDeMnacare getFelDeMnacare(TipMancare tipMancare, float pret, float gramaj);
    public FelDeMnacare getFelDeMnacare(TipMancare tipMancare, float pret, float gramaj, int calorii);


}
