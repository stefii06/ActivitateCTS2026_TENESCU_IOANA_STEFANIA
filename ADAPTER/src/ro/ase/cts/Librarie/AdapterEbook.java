package ro.ase.cts.Librarie;

public class AdapterEbook implements Carte{
    private EbookExtern ebook;

    public AdapterEbook(EbookExtern ebook) {
        this.ebook = ebook;
    }

    @Override
    public String getTitlu() {
        return ebook.getTitluEbook();
    }

    @Override
    public String getAutor() {
        return ebook.getAutorEbook();
    }

    @Override
    public double getPret() {
        return ebook.getPretEbook();
    }

    @Override
    public void achizitionare() {
        ebook.descarcaEbook();

    }


}
