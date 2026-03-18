package ro.ase.cts.clase.RESTAURANT;

public class SupaDeCiuperci extends Supa{


    public SupaDeCiuperci(String clasificare, int nrLegumeFolosite) {
        super(clasificare, nrLegumeFolosite);
    }


    @Override
    public void afisareDescriere() {
        StringBuilder sb = new StringBuilder("Supa de ciuperci");
        sb.append(" tip: ").append(this.clasificare) ;
        sb.append(", legume folosite: ").append(this.nrLegumeFolosite);
        System.out.println(sb.toString());

    }
}
