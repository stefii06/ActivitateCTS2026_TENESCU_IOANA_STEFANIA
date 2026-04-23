package ro.ase.cts.Librarie;

public class CarteFizica implements Carte{
    private String titlu;
    private String autor;
    private double pret;

    public CarteFizica(String titlu, String autor, double pret) {
        this.titlu = titlu;
        this.autor = autor;
        this.pret = pret;
    }

    @Override
    public String getTitlu() {
        return titlu;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public double getPret() {
        return pret;
    }

    @Override
    public void achizitionare() {
        System.out.println("Cartea " +this.getTitlu()+ " de " + this.getAutor()+ " a fost rezervata! ");

    }
}
