package ro.ase.cts.Librarie;

public class EbookExtern {
    private String titluEbook;
    private String autorEbook;
    private double pretEbook;
    private int nrPagEbook;

    public EbookExtern(String titluEbook, String autorEbook, double pretEbook, int nrPagEbook) {
        this.titluEbook = titluEbook;
        this.autorEbook = autorEbook;
        this.pretEbook = pretEbook;
        this.nrPagEbook = nrPagEbook;
    }


    public String getTitluEbook() {
        return titluEbook;
    }

    public String getAutorEbook() {
        return autorEbook;
    }

    public double getPretEbook() {
        return pretEbook;
    }

    public int getNrPagEbook() {
        return nrPagEbook;
    }

    public void descarcaEbook(){
        System.out.println("Ebook-ul " + titluEbook + " de " + autorEbook+ " a fost descarcat!"  );
    }


}


