package ro.ase.cts.fabrici;

import ro.ase.cts.clase.FelDeMnacare;
import ro.ase.cts.enums.TipMancare;

public interface FabricaAbstracta {
    public FelDeMnacare getFelDeMnacare(TipMancare tipMancare, float pret, float gramaj);
    public FelDeMnacare getFelDeMnacare(TipMancare tipMancare, float pret, float gramaj, int calorii);


}
