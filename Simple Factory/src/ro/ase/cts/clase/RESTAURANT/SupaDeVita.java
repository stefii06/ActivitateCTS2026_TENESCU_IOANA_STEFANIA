package ro.ase.cts.clase.RESTAURANT;

public class SupaDeVita extends Supa{


    public SupaDeVita(String clasificare, int nrLegumeFolosite) {
        super(clasificare, nrLegumeFolosite);
    }

    @Override
    public void afisareDescriere() {

        StringBuilder sb = new StringBuilder("Supa de vita");
        sb.append(" tip: ").append(this.clasificare) ;
        sb.append(", legume folosite: ").append(this.nrLegumeFolosite);
        System.out.println(sb.toString());

    }



}
