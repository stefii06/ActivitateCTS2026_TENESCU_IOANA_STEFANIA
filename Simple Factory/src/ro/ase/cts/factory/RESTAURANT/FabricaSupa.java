package ro.ase.cts.factory.RESTAURANT;

import ro.ase.cts.clase.RESTAURANT.Supa;
import ro.ase.cts.clase.RESTAURANT.SupaDeCiuperci;
import ro.ase.cts.clase.RESTAURANT.SupaDeLegume;
import ro.ase.cts.clase.RESTAURANT.SupaDeVita;

public class FabricaSupa {

    public Supa getSupa (TipSupa tipSupa, String clasificare, int nrLegume) throws Exception {
        switch (tipSupa){
            case SupaDeCiuperci:
                return new SupaDeCiuperci(clasificare, nrLegume);
            case SupaDeLegume:
                return new SupaDeLegume(clasificare, nrLegume);
            case SupaDeVita:
                return new SupaDeVita(clasificare, nrLegume);
                default:
                    throw new Exception("EORARE : Tipul de supa nu exista!!!");
        }
    }

}
