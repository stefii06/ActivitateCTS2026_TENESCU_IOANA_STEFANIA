package ro.ase.cts.clase;

public class Autobuz extends MijlocTransport{

    public Autobuz(int nrRoti, String nrInmatriculare) {
        super(nrRoti, nrInmatriculare);
    }

    @Override
    public void afisareDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autobuzul are: numar roti: ").append(this.nrRoti);
        sb.append(", Numar Inmatriculare: ").append(this.nrInmatriculare);
        System.out.println(sb.toString());
    }
}
