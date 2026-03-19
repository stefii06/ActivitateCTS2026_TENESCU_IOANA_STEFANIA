package ro.ase.cts.clase;

public class Papanasi extends Desert {

    public Papanasi(float pret, float gramaj, int calorii) {
        super(pret, gramaj, calorii);
    }

    @Override
    public void afisare() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Papanasi au").append(super.toString());
        System.out.println(sb);

    }
}
